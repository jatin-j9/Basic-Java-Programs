public class democontinue {

	public static void main(String[] args) {
		int i;
		for(i=0;i<5;i++)
		{
			if(i==2)
				continue;
			System.out.println("i= "+i);
		}
        System.out.println("End of loop");

	}

}
