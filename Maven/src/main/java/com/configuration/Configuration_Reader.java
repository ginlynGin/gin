

package com.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
public static Properties p;
	public Configuration_Reader() throws IOException {
		
		File f=new File("D:\\maven workspace\\Maven\\src\\main\\java\\properties file\\configuration.properties");
		FileInputStream  fis=new FileInputStream(f);
		 p=new Properties();
		p.load(fis);
		
		
	}
	public String get_url() {

		String url = p.getProperty("url");
		return url;
		
		
	}
	public String get_username() {

		String uname = p.getProperty("username");
		return uname;
		
		
	}
	public String get_Password() {
		String password = p.getProperty("password");
		return password;
		
		
		
	}
//	public String get_Browser() {
//		String browser= p.getProperty("chrome");
//		return browser;
//		
//	}	
	
}
