package com.filemanager;

import java.io.IOException;

import com.configuration.Configuration_Reader;

public class FileReadManager {

//private	
	
	private void FileReadManager() {

	}
	
	
//static	
	
	public static FileReadManager getInstanceFRM() {
		FileReadManager frm=new FileReadManager	();
		return frm;
		

	}
	
	//non static	
	public Configuration_Reader getinstanceCRM() throws IOException {
		Configuration_Reader crm=new Configuration_Reader();
		return crm;
		
		
	}
	
	
	
	
	
	

}

