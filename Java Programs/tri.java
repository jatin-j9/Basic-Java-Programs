import java.util.*;
class triangle_area
{
	float base;
	float height;
	float area()
	{
		float a;
		a=(base*height)/2;
		return a;
	}
}
public class tri {

	public static void main(String[] args) {
		float ar;
		triangle_area t1=new triangle_area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and height of triangle: ");
		t1.base=sc.nextInt();
		t1.height=sc.nextInt();
		ar=t1.area();
		System.out.println("---Result---");
		System.out.println("Base of triangle: " + t1.base);
		System.out.println("Height of triangle: " + t1.height);
		System.out.println("Area of triangle: " + ar);
	}

}
