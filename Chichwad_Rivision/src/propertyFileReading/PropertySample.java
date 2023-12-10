package propertyFileReading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertySample 
{

	public static void main(String[] args) throws IOException 
	{
//		1.create the object of fis and pass path 
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\My Pc\\eclipse-workspace\\Chichwad_Rivision\\RivisionTest");
		
//		crate object of properties class 
		
		Properties prop = new Properties();
		
//		use method load & pass file as argument 
		
		prop.load(myfile);
		
//		read data from file 
		
		String myTest = prop.getProperty("url");
		
		System.out.println(myTest);
		
	}
}
