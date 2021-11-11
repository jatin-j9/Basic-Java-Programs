import java.util.*;
class university
{
	float percentage(float A[])
	{
		float sum=0, percent;
		for(int i=0;i<6;i++)
		{
			sum = sum+A[i];
		}
		percent = (sum/600)*100;
		return percent;
	}
	
	void display(float A[], float p)
	{
		if(p<60)
		{
			float min = A[0];
			for(int i=1;i<6;i++)
			{
				if(A[i]<min)
					min = A[i];
			}
			System.out.print("Lowest Marks: " + min + "\n");
			System.out.println("The student will have to repeat this course in the next Semester.");
		}
	}
}
public class academics {
	public static void main(String[] args) {
		university uni = new university();
		Scanner sc = new Scanner(System.in);
		float marks[] = new float[6];
		float percent;
		System.out.println("Enter the marks of 6 courses(out of 100): ");
		for(int i=0;i<6;i++)
		{
			marks[i] = sc.nextInt();
		}
		percent = uni.percentage(marks);
		System.out.print("Percentage this semester: " + percent + "\n");
		uni.display(marks, percent);
	}
}
