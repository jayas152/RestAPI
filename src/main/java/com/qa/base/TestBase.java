package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	// this class is to read from properites file
	public Properties prop;
	public int RESPONSE_STATUS_CODE_200 = 200;
	public int RESPONSE_STATUS_CODE_500 = 500;
	public int RESPONSE_STATUS_CODE_400 = 400;
	public int RESPONSE_STATUS_CODE_401 = 401;
	public int RESPONSE_STATUS_CODE_201 = 201;

	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream("/Users/jayas/Desktop/Selenium_WorkSpace/RestAPI/src/main/java/com/qa/config/Config.properties");
			prop.load(fi);
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		catch(IOException e) {
			e.printStackTrace();
			}
		}
	}


 