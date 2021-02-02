package com.log4j.demo;

import org.apache.log4j.Logger;

import com.log4j.demo.service.MyService;

public class Main {

	private static Logger log=Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		log.trace("Hello from TRACE");
		log.debug("Hello from DEBUG");
		log.info("Hello from INFO");
		log.warn("Hello from WARN");
		log.error("Hello from ERROR");
		log.fatal("Hello from FATAL");
		
		MyService m=new MyService();
		m.iAmServiceMethod1("test Username");

	}

}
