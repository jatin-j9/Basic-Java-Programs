import java.util.*;
public class max_array {
	public static void main(String[] args) {
		int maxe, maxo, maxp, e, o, p, count=0;
		int num[] = new int[10];
		int even[] = {0,0,0,0,0,0,0,0,0,0};
		int odd[] = {0,0,0,0,0,0,0,0,0,0};
		int prime[] = {0,0,0,0,0,0,0,0,0,0};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ten numbers in the Array");
		for(int i=0;i<10;i++)
		{
			num[i] = sc.nextInt();
		}
		for(int j=0;j<10;j++)
		{
			for(int k=1;k<=num[j];k++)
			{
				if(num[j]%k==0 && k%2==0)
					even[j] = even[j]+1;
				else if(num[j]%k==0 && k%2!=0)
					odd[j] = odd[j]+1;
				else if(num[j]%k==0)
				{
					for(int l=1;l<=k;l++)
					{
						if(k%l==0)
							count = count+1;
					}
					if(count==2)
						prime[j] = prime[j]+1;
				}
			}
		}
		maxe = even[0];
		e=0;
		for(int i=1;i<10;i++)
		{
			if(even[i]>maxe)
			{
				maxe = even[i];
				e=i;
			}
		}
		maxo = odd[0];
		o=0;
		for(int i=1;i<10;i++)
		{
			if(odd[i]>maxo)
			{
				maxo = odd[i];
				o=i;
			}
		}
		maxp = prime[0];
		p=0;
		for(int i=1;i<10;i++)
		{
			if(prime[i]>maxp)
			{
				maxp = prime[i];
				p=i;
			}
		}
		System.out.println("Number having maximum even factors: " + num[e]);
		System.out.println("Number having maximum odd factors: " + num[o]);
		System.out.println("Number having maximum prime factors: " + num[p]);
	}
}
