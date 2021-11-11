import java.util.*;
public class circ_mat {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix: ");
		N = sc.nextInt();
		int mat[][] = new int[N][N];
		int x=1, c1=0, c2=N-1, r1=0, r2=N-1;
        while(x<=N*N)
            {
                for(int i=c1;i<=c2;i++)
                {
                    mat[r1][i]=x++;
                }
                for(int j=r1+1;j<=r2;j++)
                {
                    mat[j][c2]=x++;
                }
                for(int k=c2-1;k>=c1;k--)
                {
                    mat[r2][k]=x++;
                }
                for(int l=r2-1;l>=r1+1;l--)
                {
                    mat[l][c1]=x++;
                }
                c1 = c1+1;
                c2 = c2-1;
                r1 = r1+1;
                r2 = r2-1;
            }
        System.out.println("Required Matrix:");
        for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                    {
                        System.out.print(mat[i][j]+ " ");
                    }
             System.out.println();
            }
	}
}
