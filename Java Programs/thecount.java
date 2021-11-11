import java.util.*;
public class thecount {

	public static void main(String[] args) {
		String str;
		int len, i, count = 0;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		len = str.length();
		for(i=0;i<len-2;i++)
		{
			if(str.charAt(i)=='t' && str.charAt(i+1)=='h' && str.charAt(i+2)=='e')
			{
				count = count+1;
			}
		}
		System.out.println("Number of times 'the' occurs= " + count);
	}

}
