import java.util.*;
public class transpose {

	public static void main(String[] args) {
		int mat[][]=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in the matrix");
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
		System.out.println("Transpose of Matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
	}

}
