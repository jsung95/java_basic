package Clazz;

import Annotation.C01_Service;
import lombok.extern.log4j.Log4j;


@Log4j
public class Clazz {
	public static void main(String[] args) {
		
		Class<C01_Service> clazz = C01_Service.class;
		
		log.info("1. clazz : " + clazz);
		log.info("2. type2 : " + clazz.getName());
		log.info("3. type3 : " + clazz.getClass().getName());
		
		//----------------------------------------------------//
		
		Class<Clazz> clazz2 = Clazz.class;
		
		log.info("1. clazz : " + clazz2);
		log.info("2. type2 : " + clazz2.getName());
		log.info("3. type3 : " + clazz2.getClass().getName());

		//----------------------------------------------------//
		
		
		clazz.getFields();
		clazz.getConstructors();
		clazz.getMethods();
		clazz.getAnnotations();
		clazz.getDeclaredAnnotations();
		clazz.getPackage();
		clazz.getSuperclass();
	}// main
	
}// end class
