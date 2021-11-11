import java.util.*;
public class matrixops {

	public static void main(String[] args) {
		int mat[][]=new int[3][3];
		int i,j,sumd=0,sumrow=0,sumcol=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in 3x3 matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i==j)
					sumd=sumd+mat[i][j];
			}
		}
		System.out.println("Sum of diagonal: " + sumd);
		for(i=0;i<3;i++)
		{
			sumrow=0;
			for(j=0;j<3;j++)
			{
				sumrow=sumrow+mat[i][j];
			}
			System.out.println("Sum of Row"+i+": "+sumrow);
		}
		for(i=0;i<3;i++)
		{
			sumcol=0;
			for(j=0;j<3;j++)
			{
				sumcol=sumcol+mat[j][i];
			}
			System.out.println("Sum of Column"+i+": "+sumcol);
		}
		
	}

}
