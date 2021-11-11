class thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Hello Thread 1");
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Hello Thread 2");
		}
	}
}
public class examplethread {

	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		t1.start();
		t2.start();

	}

}
