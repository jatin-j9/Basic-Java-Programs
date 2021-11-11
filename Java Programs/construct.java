class shapearea
{
	int length, breadth;
	shapearea()
	{
		length=25;
		breadth=25;
	}
	shapearea(int l, int b)
	{
		length=l;
		breadth=b;
	}
	int area()
	{
		int a;
		a=length*breadth;
		return a;
	}
}
public class construct {

	public static void main(String[] args) {
		shapearea ar1=new shapearea();
		shapearea ar2=new shapearea(30,12);
		int val1,val2;
		val1=ar1.area();
		val2=ar2.area();
		System.out.println("the value of area 1: " + val1);
		System.out.println("the value of area 2: " + val2);
	}

}
