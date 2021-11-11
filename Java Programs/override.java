class superrectt
{
	int l,b;
	void display()
	{
		System.out.println("Length: " + l);
		System.out.println("Breadth: " + b);
	}
}

class subrectt extends superrectt
{
	int s;
	void display()								//overrides superrectt's 'display' method
	{
		super.display();						//'super' used to access overridden method also
		s=l*b;
		System.out.println("Area: " + s);
	}
}
public class override {

	public static void main(String[] args) {
		subrectt sbr = new subrectt();
		sbr.l=25;
		sbr.b=15;
		sbr.display();

	}

}
