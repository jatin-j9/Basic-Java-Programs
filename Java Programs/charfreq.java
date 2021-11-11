import java.util.*;
public class charfreq {

	public static void main(String[] args) {
		String str1;
		char chr1;
		int i, j, len, count=0;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		len = str1.length();
		char buf[] = new char[len];
		str1.getChars(0,len,buf,0);
		for(i=0;i<len;i++)
		{
			chr1 = buf[i];
			for(j=0;j<len;j++)
			{
				if(chr1==buf[j] && chr1!=' ')
				{
					count = count+1;
					buf[j] = ' ';
				}
			}
			if(chr1 == ' ')
				continue;
			System.out.println(chr1 + "occurs " + count + "times");
			count = 0;
		}

	}

}
