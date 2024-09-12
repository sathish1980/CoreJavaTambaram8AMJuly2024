package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {
	
	String filepath = System.getProperty("user.dir")+"\\Input\\env.properties";
	
	public void readData() throws IOException
	{
		File F =new File (filepath);
		FileInputStream Fs = new FileInputStream(F);
		Properties P = new Properties();
		P.load(Fs);
		System.out.println(P.getProperty("url"));
		System.out.println(P.getProperty("id"));
		
		System.out.println(P.getProperty("password"));
		P.setProperty("DOB", "121212");
		System.out.println(P.getProperty("DOB"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyFileRead P = new PropertyFileRead();
		P.readData();
	}

}
