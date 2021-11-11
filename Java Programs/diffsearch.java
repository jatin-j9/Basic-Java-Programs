import java.util.*;
class numsearch
{
	void search() {
		int arr[]=new int[10];
		int i, num;
		System.out.println("Enter ten numbers: ");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number to search");
		num=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(arr[i]==num)
				System.out.println("The number is present at location: " + i);
		}
	}
	
	void search(int arr[], int first, int last, int num)
	{
		int i,mid;
		while(first<=last)
		{
			mid=(first+last)/2;
			if (arr[mid]==num)
			{
				System.out.println("The number is found at location: " + mid);
				break;
			}
			if(arr[mid]>num)
			{
				last=mid-1;
			}
			if(arr[mid]<num)
			{
				first=mid+1;
			}
		}
	}
}
public class diffsearch {

	public static void main(String[] args) {
		numsearch ns = new numsearch();
		int arr[]=new int[10];
		int n;
		ns.search();
		System.out.println("Enter a ten numbers: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter a number to search: ");
		n=sc.nextInt();
		ns.search(arr,0,9,n);
	}

}
