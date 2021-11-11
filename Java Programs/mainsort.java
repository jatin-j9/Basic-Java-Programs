import java.util.*;
class numsort
{
	int size(int x)
	{
		int nod=0, temp1=x;
		while(temp1>0)
		{
			temp1 = temp1/10;
			nod = nod+1;
		}
		return nod;
	}
	
	void sort(int num)
	{
		int n, i=0, digit1, temp2=num, temp3;
		n = size(num);
		int arr1[] = new int[n+1];
		while(temp2>0)
		{
			digit1 = temp2%10;
			arr1[i] = digit1;
			temp2 = temp2/10;
			i = i+1;
		}
		for(int j=0;j<n;j++)
		{
			for(int k=1;k<n-j;k++)
			{
				if(arr1[k-1]>arr1[k])
				{
					temp3 = arr1[k-1];
					arr1[k-1] = arr1[k];
					arr1[k] = temp3;
				}	
			}
		}
		System.out.println("Sorted: ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr1[i]);
		}
		System.out.println("\n");
	}

	void sort(int A[], int asize)
	{
		System.out.println("Sorted: ");
		for(int m=0;m<asize;m++)
		{
			int n, i=0, digit2, temp3=A[m], temp4;
			n = size(A[m]);
			int arr2[] = new int[n+1];
			while(temp3>0)
			{
				digit2 = temp3%10;
				arr2[i] = digit2;
				temp3 = temp3/10;
				i = i+1;
			}
			for(int j=0;j<n;j++)
			{
				for(int k=1;k<n-j;k++)
				{
					if(arr2[k-1]>arr2[k])
					{
						temp4 = arr2[k-1];
						arr2[k-1] = arr2[k];
						arr2[k] = temp4;
					}	
				}
			}
			for(i=0;i<n;i++)
			{
				System.out.print(arr2[i]);
			}
			System.out.print(" ");
		}
	}
}
public class mainsort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		numsort ns = new numsort();
		int arr[] = new int[10];
		int s;
		System.out.println("Enter a number: ");
		s = sc.nextInt();
		ns.sort(s);
		System.out.println("Enter 10 numbers in the array: ");
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		ns.sort(arr,10);
	}

}
