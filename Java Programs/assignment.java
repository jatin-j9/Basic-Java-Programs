import java.util.*;
public class assignment {

	public static void main(String[] args) {
		int i,j,max,min;
		int mat3[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the 3x3 matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat3[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nMatrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			max=min=mat3[i][0];
			for(j=0;j<3;j++)
			{
				if (mat3[i][j]>max)
					max=mat3[i][j];
				else if (mat3[i][j]<min)
					min=mat3[i][j];
			}
			System.out.print("\nThe largest number in row" + i + " is " + max);	
			System.out.print("\nThe smallest number in row" + i + " is " + min);
		}
		System.out.println();
		for(i=0;i<3;i++)
		{
			max=min=mat3[0][i];
			for(j=0;j<3;j++)
			{
				if (mat3[j][i]>max)
					max=mat3[j][i];
				else if (mat3[j][i]<min)
					min=mat3[j][i];
			}
			System.out.print("\nThe largest number in column" + i + " is " + max);
			System.out.print("\nThe smallest number in column" + i + " is " + min);
		}
	}

}
