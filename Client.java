public class Client
{
	public static void main(String args[])
	{
		List list = new List();
		list.atPos(100,1);
		list.append(1);
		list.begin(2);
		list.append(3);
		list.atPos(200, 3);
		list.disp();
	}
}
