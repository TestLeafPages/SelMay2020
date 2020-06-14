package week7.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnToReadPropertiesFile {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		
		//FileInputStream fis = new FileInputStream("./src/main/resources/english.properties");
		
		//prop.load(fis);
		prop.load(new FileInputStream("./src/main/resources/english.properties"));
		
		System.out.println(prop.getProperty("HomePage.logout.xpath"));
		
		

	}

}
