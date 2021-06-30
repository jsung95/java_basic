package FieldInitValue;

import lombok.extern.log4j.Log4j;


@Log4j
public class C06_FieldInitValueTest {
	public static void main(String[] args) {
		C05_FieldInitValue fiv = new C05_FieldInitValue();
		
		log.info("byteField : " + fiv.byteField);
		log.info("shortField : " + fiv.shorField);
		log.info("intField : " + fiv.intField);
		log.info("longField : " + fiv.longField);
		log.info("booleanField : " + fiv.booleanField);
		log.info("charField : " + fiv.charField);
		log.info("floatField : " + fiv.floatField);
		log.info("doubleField : " + fiv.doubleField);
		log.info("arrField : " + fiv.arrField);
		log.info("referenceField : " + fiv.referenceField);
		
	} //main
} //end class
