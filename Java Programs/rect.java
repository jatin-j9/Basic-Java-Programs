import java.util.*;
class rectangle
{
	int length;
	int breadth;
	rectangle(int a,int b)
	{
		length=a;
		breadth=b;
	}
	int area()
	{
		int a;
		a=length*breadth;
		return a;
	}
}
public class rect {

	public static void main(String[] args) {
		rectangle r1=new rectangle(20,20);
		rectangle r2=new rectangle(30,30);
		int ar1,ar2;
		ar1=r1.area();
		System.out.println("Length1: " + r1.length);
		System.out.println("Breadth1: " + r1.breadth);
		System.out.println("Area1: " + ar1);
		System.out.println();
		ar2=r2.area();
		System.out.println("Length2: " + r2.length);
		System.out.println("Breadth2: " + r2.breadth);
		System.out.println("Area2: " + ar2);
	}

}
