class throwtest
{
	void xyz()
	{
		try
		{
			throw new NullPointerException("Exception thrown explicitly");
		}
		catch(NullPointerException e)
		{
			System.out.println("caught inside xyz");
			throw e;
		}
	}
}
public class exthrow {

	public static void main(String[] args) {
		throwtest tt = new throwtest();
		try
		{
			tt.xyz();
		}
		catch(NullPointerException e)
		{
			System.out.println("caught inside main" + e);
		}

	}

}
