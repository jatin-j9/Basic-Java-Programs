import java.util.*;
public class String_long {

	public static void main(String[] args) {
		String str, word="", large="";
		String words[] = new String[100];
		int len, len1, size=0, count=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = sc.nextLine() + " ";
		len = str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)!=' ')
				word = word + str.charAt(i);
			else
			{
				words[size] = word;
				size = size + 1;
				word = "";
			}
		}
		large = words[0];
		for(int j=1;j<size;j++)
		{
			if(large.length()<words[j].length())
				large = words[j];
		}
		System.out.println("The longest word in the string is: " + large);
		len1 = large.length();
		char ext[] = new char[len1];
		large.getChars(0,len1,ext,0);
		for(int i=0;i<len1;i++)
		{
			ch = ext[i];
			for(int j=0;j<len1;j++)
			{
				if(ch==ext[j] && ch!=' ')
				{
					count = count+1;
					ext[j] = ' ';
				}
			}
			if(ch == ' ')
				continue;
			System.out.println(ch + " occurs " + count + " time(s)");
			count = 0;
		}
	}

}
