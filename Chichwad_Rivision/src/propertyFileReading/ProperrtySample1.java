package propertyFileReading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProperrtySample1 
{

	public static void main(String[] args) throws IOException 
	{
		readDataFromPropertyFile("url");
		readDataFromPropertyFile("userName");
	}

	private static String readDataFromPropertyFile(String key) throws IOException 
	{
		FileInputStream myFile = new FileInputStream("C:\\\\Users\\\\My Pc\\\\eclipse-workspace\\\\Chichwad_Rivision\\\\RivisionTest");
		Properties prop = new Properties();
		prop.load(myFile);
		String value = prop.getProperty(key);
		System.out.println(value);
		return value;
	}
}
