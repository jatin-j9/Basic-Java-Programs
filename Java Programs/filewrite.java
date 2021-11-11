import java.io.*;
public class filewrite {

	public static void main(String[] args) {
		try
		{
			FileWriter fr = new FileWriter("D:/testfile1.txt");
			BufferedWriter bw = new BufferedWriter(fr);
			String str = "This is a test again";
			bw.write(str);
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
