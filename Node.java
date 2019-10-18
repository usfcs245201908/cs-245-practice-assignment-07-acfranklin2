public class Node<T>
{
	Node<T> next;
	T data;

	public Node(T data, Node<T> next)
	{
		next = this.next;
		data = this.data;
	}

	public Node(T item)
	{
		data = item;
	}

}