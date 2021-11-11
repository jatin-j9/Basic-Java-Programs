public class demobreak {

	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++)
		{
			if(i==2)
				break;
			System.out.println("i= "+i);
		}
        System.out.println("End of loop");
	}

}
