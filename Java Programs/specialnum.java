public class specialnum {

	public static void main(String[] args) {
		int i, j, num, sum, digit, fact;
		for(i=1;i<=10000;i++)
		{
			num=i;
			sum=0;
			while (num>0)
			{
				digit=num % 10;
				fact=1;
				for(j=1;j<=digit;j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
				num=num/10;
			}
			if(sum==i)
				System.out.println(i + " is a Special Number");
		}
	}
}
 