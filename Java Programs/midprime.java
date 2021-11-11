import java.util.*;
public class midprime {

	public static void main(String[] args) {
		int i, j, k, num, mid, count;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten three digits numbers: ");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("\nRequired Output: ");
		for(j=0;j<10;j++)
		{
			num=arr[j];
			num=num/10;
			mid=num%10;
			count=0;
			for(k=1;k<=mid;k++)
			{
				if(mid%k==0)
					count++;
			}
			if(count==2)
				System.out.print(arr[j] + " ");
		}
	}
}
