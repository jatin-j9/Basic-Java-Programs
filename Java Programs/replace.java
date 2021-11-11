import java.util.*;
public class replace {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int i,n1,n2;
		System.out.println("Enter ten elements: ");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array: ");
		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter a new number: ");
		n1=sc.nextInt();
		System.out.println("Enter the number you want to replace: ");
		n2=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(arr[i]==n2)
				arr[i]=n1;
		}
		System.out.println("Modified Array: ");
		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
