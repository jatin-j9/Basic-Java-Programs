import java.util.*;
public class prime {

	public static void main(String[] args) {
		int num,i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i!=0)
				continue;
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(num+" is a Prime Number");
		else
			System.out.println(num+" is not a Prime Number");
		
	}

}
