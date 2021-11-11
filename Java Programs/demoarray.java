import java.util.*;
public class demoarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array: ");
		for(i=0;i<n;i++)
		{
		System.out.println(arr[i]);
		}

	}

}
