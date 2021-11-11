class threadA extends Thread
{
	public void run()
	{
		System.out.println("Thread A started");
		for(int i=0;i<4;i++)
		{
			System.out.println("From Thread A: i= " + i);
		}
		System.out.println("Exit from A");
	}
}
class threadB extends Thread
{
	public void run()
	{
		System.out.println("Thread B started");
		for(int i=0;i<4;i++)
		{
			System.out.println("From Thread B: i= " + i);
		}
		System.out.println("Exit from B");
	}
}
class threadC extends Thread
{
	public void run()
	{
		System.out.println("Thread C started");
		for(int i=0;i<4;i++)
		{
			System.out.println("From Thread C: i= " + i);
		}
		System.out.println("Exit from C");
	}
}
public class threadscheduling {

	public static void main(String[] args) {
		threadA a = new threadA();
		threadB b = new threadB();
		threadC c = new threadC();
		
		c.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(Thread.NORM_PRIORITY);
		a.setPriority(Thread.MIN_PRIORITY);
		
		a.start();
		b.start();
		c.start();
	}

}
