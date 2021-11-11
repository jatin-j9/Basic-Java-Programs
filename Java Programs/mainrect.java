class superrect
{
	int l,b;
	void display()
	{
		System.out.print("Length= " + l + "\n");
		System.out.print("Breadth= " + b + "\n");
	}
}
class subrect extends superrect
{
	void area() {
		int s;
		s=l*b;
		System.out.print("Area: " + s + "\n");	
		}
}
public class mainrect {

	public static void main(String[] args) {
		superrect sp = new superrect();
		subrect sb = new subrect();
		sp.l=25;
		sp.b=15;
		System.out.println("The contents of superclass are: ");
		sp.display();
		
		sb.l=30;
		sb.b=12;
		System.out.println("The contents of subclass are: ");
		sb.display();
		sb.area();

	}

}
