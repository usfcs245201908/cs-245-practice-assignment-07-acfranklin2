public class LinkedList<T> implements List<T>
{
	protected Node<T> first;
	protected Node<T> last;
	protected int size;

	public LinkedList()
	{
		first = null;
		last = null;
		size = 0;
	}

	public void add(T item)
	{
		Node<T> node = first;
		while(node.next != null)
			node = node.next;
		Node n = new Node(item);
		node.next = n;
		++size;
	}

	public void add(int pos, T item)
	{
		try{
			if((pos < 0) || (pos > size))
				throw new Exception("Position is an invalid amount.");
		}
		catch(Exception e){};
		Node<T> node = first;
		int place = 0;
		while(place < pos)
			node = node.next;
		Node<T> n = new Node(item);
		node.next = n;
	}

	public T remove(int pos)
	{
		try {
			if((pos<=0) || (pos>size))
				throw new Exception("Invalid position amount.");
		}
		catch(Exception e){};
		Node<T> temp = first;
		int place = 0;
		while(temp.data != get(pos))
			temp = temp.next;
		T value = temp.data;
		Node<T> current = temp;
		temp = current.next;
		current = current.next.next;
		--size;
		return(value);

	}

	public T get(int pos)
	{
		try {
			if((pos<=0) || (pos>size))
				throw new Exception("Invalid position amount.");
		}
		catch(Exception e){};
		if(pos == 0)
			return(first.data);
		Node<T> previous = first;
		Node<T> current = first.next;
		int place = 1;
		while(place < pos)
			current = current.next;
		T value = current.data;
		return(value);
	}

	public int size()
	{
		return(size);
	}




	

}