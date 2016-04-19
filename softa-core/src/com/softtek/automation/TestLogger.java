package com.softtek.automation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {

	static Logger LOGGER;

	public static void DEBUG(Object object, String message) {
		LOGGER = LoggerFactory.getLogger(object.getClass());
		LOGGER.debug(message);
	}
}
