import java.util.*;
class nextprime
{
	int check(int chk)
	{
		int num = chk;
		int prime[] = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
								101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
								211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293,
								307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397,
								401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499,
								503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599,
								601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691,
								701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797,
								809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887,
								907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
		for(int i=0;i<168;i++)
		{
			if(chk==prime[i])
				num = prime[i+1];
		}
		return num;
	}
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
	void nprime(int n)
	{
		int i=0, temp=n, digit;
		int len = size(n);
		int arr[] = new int[len]; 
		while(temp>0)
		{
			digit = temp%10;
			arr[i] = digit;
			temp = temp/10;
			i = i+1;
		}
		for(int j=0;j<len;j++)
		{
			arr[j] = check(arr[j]);
		}
		System.out.println("Output: ");
		for(int j=len-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		System.out.println("\n");
	}
	void nprime(int A[], int s)
	{
		for(int i=0;i<s;i++)
		{
			A[i] = check(A[i]);
		}
		System.out.println("Output: ");
		for(int i=0;i<s;i++)
		{
			System.out.print(A[i] + " ");
		}
	}
}
public class mainprime {
	public static void main(String[] args) {
		nextprime np = new nextprime();
		int z;
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		z = sc.nextInt();
		np.nprime(z);
		System.out.println("Enter 10 numbers of the array: ");
		for(int i=0;i<10;i++)
		{
			a[i] = sc.nextInt();
		}
		np.nprime(a,10);
	}
}
