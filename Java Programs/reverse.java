import java.util.*;
public class reverse {

	public static void main(String[] args) {
		int i, j, num, digit, rev;
		int mat[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of a 3x3 matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMATRIX: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i == j || (i==0&&j==2) || (i==2&&j==0))
				{
					rev=0;
					num=mat[i][j];
					while(num>0)
					{
						digit = num%10;
						rev = rev*10 + digit;
						num = num/10;
					}
					mat[i][j] = rev;
				}
			}
		}
		System.out.println("\nREQUIRED OUTPUT: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
 