package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		//--1. .properties파일을 handling할 수 있는 Map객체로 Properties객체 생성 
		Properties properties = new Properties();
		
		//--2. .properties파일의 위치(경로) 얻기
		String path = PropertiesExample.class.getResource("database.properties").getPath();

		log.info("- path : " + path);

		//--3. Classpath에서 찾은 database.properties 파일의 경로가 이미 URL Encoding 되어있기 때문에,
		//		다시 역으로 URL Decoding을 수행해서, 정상적인 파일경로를 얻도록한다.
		path = URLDecoder.decode(path, "utf-8");
		log.info("- path : " + path);
		
		
		//--4. database.properties파일을 읽어서, Map객체로 끌어올리도록(loading) 한다!
		properties.load(new FileReader(path));
	
		//--5. Properties타입의 메소드 중에, 특정 요소의 값을 반환하는 메소드로, getProperty(key)가 있음.
		//     이 메소드로, database.properties 파일에 있는 값을 얻는 것과 같음.
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String name = properties.getProperty("name");
		
		//--6. database.properties 파일에 등록한 정보를 활용.
		log.info("driver : " + driver);
		log.info("url : " + url);
		log.info("username : " + username);
		log.info("password : " + password);
		log.info("name : " + name);
		
		
	}//main

}//end class
