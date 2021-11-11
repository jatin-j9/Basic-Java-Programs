import java.util.*;
public class text {
	public static void main(String[] args) {
		String txt;
		int len;
		int capital=0, small=0, special=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any text: ");
		txt = sc.nextLine();
		len = txt.length();
		char buf[] = new char[len];
		txt.getChars(0,len,buf,0);
		for(int i=0;i<len;i++)
		{
			if(buf[i]>='A' && buf[i]<='Z')
				capital = capital+1;
			else if(buf[i]>='a' && buf[i]<='z')
				small = small+1;
			else
				special = special+1;
		}
		System.out.println("Number of Capital Alphabets: " + capital);
		System.out.println("Number of Small Alphabets: " + small);
		System.out.println("Number of Special Characters: " + special);
	}
}
