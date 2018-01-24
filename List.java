public class List
{
	private Node head = null;
	public void begin(int k)
	{
		Node temp = new Node(k);
		temp.next = head;
		head = temp;
	}
	public void disp()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.key+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public void append(int k)
	{
		Node temp = new Node(k);
		if(head == null)
		{
			head = temp;
			temp.next = null;
		}
		else
		{
			Node pres = head;
			Node prev = null;
			while(pres != null)
			{
				prev = pres;
				pres = pres.next;
				//prev = pres;
			}
			prev.next = temp;
			temp.next = pres;
		}
	}
	public void atPos(int k, int pos)
	{
		Node temp = new Node(k);
		if(head == null)
		{
			temp.next = head;
			head = temp;
		}
		else
		{
			Node pres = head;
			Node prev = null;
			int i = 1;
			while(pres != null && i< pos)
			{
				prev = pres;
				pres = pres.next;
				i++;
			}
			if(prev == null)
			{
				head = temp;
				temp.next = pres;
			}
			else
			{
				prev.next = temp;
				temp.next = pres;
			}
		}
	}
}
class Node
{
	public Node next = null;
	public int key;
	public Node(int k)
	{
		key = k;
	}
}
