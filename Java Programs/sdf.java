import java.util.Scanner;
class sumofdigitclass
{
	int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	void sumofdigitfact(int number)
	{
		int digit,sum=0,facto;
		while(number!=0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		facto=factorial(sum);
		System.out.println("Factorial of sum of digits of the number: " + facto);
	}
}
public class sdf {

	public static void main(String[] args) {
		int n;
		sumofdigitclass s=new sumofdigitclass();
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s.sumofdigitfact(n);
	}

}
