package lesson13_collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws IOException {
	
		Properties props = new Properties();
		props.put("age", "40");
		props.put("name", "홍길동");
		
	//	System.out.println(props);
		
		props.store(new FileOutputStream("my.properties"), "#주석");

		Properties props2 = new Properties();
		props2.load(new FileInputStream("my.properties"));
		System.out.println(props);
	}

}
