import java.util.*;
public class maxmin {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int i, max, min;
		System.out.println("Enter ten elements: ");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		max=arr[0];
		min=arr[0];
		for(i=1;i<10;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}

}
