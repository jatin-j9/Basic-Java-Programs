import java.io.*;
public class filedemowrite {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fis = new FileOutputStream("D:/testfile.txt");
			String s = "This is a test";
			byte b[] = s.getBytes();
			fis.write(b);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
