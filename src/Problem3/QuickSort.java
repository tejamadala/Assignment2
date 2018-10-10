package Problem3;

public class QuickSort
{
	static class Node
	{
		Node next;
		Node prev;
		int data;
	}
	
	static Node start;
	static Node end;
	static int size;
	
	public static void LinkedList()
	{
		size=0;
		start=null;
		end=null;
	}
	
	public static void add(int a)
	{
		if(size==1)
		{
			if(start!=null)
			{
				end=start;
			}
			else if(end!=null)
			{
				start=end;
			}
		}
		size++;
		Node past=end;
		end=new Node();
		end.data=a;
		end.next=null;
		end.prev=past;
		if(past!=null && size>1)
		{
			past.next=end;
		}
	}
	
	public static void printList()
	{
		Node ptr=new Node();
		for(ptr=start; ptr!=null; ptr=ptr.next)
		{
			System.out.print(ptr.data+", ");
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList();
		add(5);
		add(73);
		add(15);
		add(2);
		add(823);
		add(100);
		printList();
	}
}