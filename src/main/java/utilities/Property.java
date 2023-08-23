package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static String  property(String key) throws IOException {
		
		File file=new File("src/test/resources/data/neha.properties");
		FileInputStream inputstream =new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(inputstream);
		return properties.getProperty(key);

	}
}
