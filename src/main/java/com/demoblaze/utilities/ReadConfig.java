package com.demoblaze.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	private Properties pro;

	public ReadConfig() {

		// path of Config.properties file
		String path = "E:\\VelocityWorkSpace\\DemoBlaze\\src\\test\\resources\\config\\Config.properties";
		// create Object for File class
		File file = new File(path);

		try {
			// create Object for FileInputStream class for read file
			FileInputStream fis = new FileInputStream(file);
			// create object for Properties class
			pro = new Properties();
			// call Properties class methods
			pro.load(fis);
		} 
		catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String getApplicationUrl() {
		String URL = pro.getProperty("url");
		return URL;
	}

	public String getUserName() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

}