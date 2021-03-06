package framework.utility;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * PropertyLoader for loading properties from property file.
 */
public class PropertyLoader {

	private static String path = "env.properties";

	private static String getProperty(String property) {

		PropertiesConfiguration properties = null;
		try {
			properties = new PropertiesConfiguration(path);
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(property).toString();
	}

	public static String getUrl() {
		return getProperty("testsite.url");
	}

	public static String getTimeout() {
		return getProperty("implicit.timeout");
	}

	public static String getSurname() {
		return getProperty("user.surname");
	}

	public static String getName() {
		return getProperty("user.name");
	}

	public static String getPass() {
		return getProperty("user.password");
	}

	public static String getEmail() {
		return getProperty("user.email");
	}

	/*
	 * Second Valid User
	 */

	public static String getSurnameValidSecondUser() {
		return getProperty("second.user.surname");
	}
	
	public static String getNameValidSecondUser() {
		return getProperty("second.user.name");
	}
	
	public static String getPassValidSecondUser() {
		return getProperty("second.user.password");
	}
	
	public static String getEmailValidSecondUser() {
		return getProperty("second.user.email");
	}
	
	
	/*
	 * Invalid User
	 */

	public static String getInvalidSurname() {
		return getProperty("invalid.user.surname");
	}

	public static String getInvalidName() {
		return getProperty("invalid.user.name");
	}

	public static String getInvalidPass() {
		return getProperty("invalid.user.password");
	}

	public static String getInvalidEmail() {
		return getProperty("invalid.user.email");
	}

}
