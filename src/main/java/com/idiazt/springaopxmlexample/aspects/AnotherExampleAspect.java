package com.idiazt.springaopxmlexample.aspects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnotherExampleAspect {

	private static Logger logger = LoggerFactory.getLogger(AnotherExampleAspect.class);
	
	public void showLogAnotherAspect() {
		logger.info("Este es el paso por AnotherExampleAspect.");
	}
}
