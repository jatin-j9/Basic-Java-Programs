import java.util.*;
class smartmart
{
	int total=0, points=0;
	void buyproduct() 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("No. of Products: ");
		n = sc.nextInt();
		int prices[] = new int[n];
		System.out.println("\nEnter the prices of individual products: ");
		for(int i=0;i<n;i++)
		{
			prices[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			total = total+prices[i];
		}
		if(total < 500)
			total = total+100;
		System.out.println("\nTotal Price: " + total);
	}
	
	void rewardpoints()
	{
		System.out.print("\nEnter Available Reward Points: ");
		Scanner sc = new Scanner(System.in);
		points = sc.nextInt();
		if(points>=40 && points<60)
		{
			total = total-((total*10)/100);
			System.out.println("\nUpdates Total Price: " + total);
		}
		else if(points>=60 && points<100)
		{
			total = total-((total*30)/100);
			System.out.println("\nUpdates Total Price: " + total);
		}
		else if(points>=100)
		{
			total = total-((total*10)/100);
			System.out.println("\nUpdates Total Price: " + total);
		}
	}
}
public class mainsmartmart {
	public static void main(String[] args) {
		smartmart sm = new smartmart();
		sm.buyproduct();
		sm.rewardpoints();
	}
}
