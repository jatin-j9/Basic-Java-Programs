import java.util.*;
class superarray
{
	int num[] = new int[10];
	void insert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		for(int i=0;i<10;i++)
		{
			num[i] = sc.nextInt();
		}
	}
}
class subarray extends superarray
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
	void display()
	{
		insert();
		int n, temp, digit, m, count;
		System.out.println("Output: ");
		for(int i=0;i<10;i++)
		{
			m=0;
			count=0;
			n=size(num[i]);
			int arr[] = new int[n];
			temp=num[i];
			while(temp>0)
			{
				digit = temp%10;
				arr[m] = digit;
				temp = temp/10;
				m = m+1;
			}
			for(int j=1;j<n;j++)
			{
				if(arr[j-1]<arr[j])
					count = count+1;
			}
			if(count==n-1)
				System.out.print(num[i] + " ");
		}
	}
}
public class mainarray {
	public static void main(String[] args) {
		subarray sbr = new subarray();
		sbr.display();
	}
}
