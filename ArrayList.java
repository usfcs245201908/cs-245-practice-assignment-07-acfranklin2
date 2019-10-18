import java.util.*;

public class ArrayList<T> implements List<T>
{
	protected T[] a;
	protected int size;

	public ArrayList()
	{
		a = (T[]) new Object[5];
		size = 0;
	}

	protected void growArray()
	{
		T[] copied = (T[]) new Object[a.length*2];
		for(int i = 0; i < a.length; i++)
			copied[i] = a[i];
		a = copied;
	}

	public void add(T item)
	{
		if((size == a.length) || (a.length == 0))
			growArray();
		a[size++] = item;
	}

	public void add(int pos, T item)
	{
		//Creates two arrays
		try
		{
			if((pos < 0) || (pos > size))
				throw new Exception("Position is an invalid amount.");
			if((size == a.length) || (a.length == 0))
				growArray();
			++size;
			for(int i = pos + 1; i < size; i++)
				a[i] = a[i-1];
			a[pos] = item;
		}
		catch(Exception e){};
	}

	public T get(int pos)
	{
		try {
			if((pos<0) || (pos>size))
				throw new Exception("Invalid position amount.");
		}
		catch(Exception e){};
		return(a[pos]);
	}

	public T remove(int pos)
	{
		T temp = a[pos];
		try{
			if((pos<0) || (pos>size))
				throw new Exception("Invalid position amount.");
			for(int i = pos; i < size; i++)
				a[i]=a[i+1];
			--size;
		}
		catch(Exception e){};
		return(temp);
		
	}

	public int size()
	{
		return(size);
	}





}