import java.util.*;
public class maximum {

	public static void main(String[] args) {
		int num1,num2,num3,max;
		System.out.println("Enter three numbers: ");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		max=num1;
		if(num2>max)
			max=num2;
		else if(num3>max)
			max=num3;
		System.out.println("Maximum is: " + max);
	}

}
