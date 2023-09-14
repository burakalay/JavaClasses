package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {

          //Tell the java where the file is located.
		
		String filePath ="C:\\Users\\Burak\\eclipse-workspace\\myFirstProgram\\configs\\example.properties";
		
		//Create an object of file input stream
		
		FileInputStream fis = new FileInputStream(filePath);
		
		// To handle .properties files; we need to use Properties class in Java
		
		Properties prop = new Properties();
     	
		//load information from .properties files using load() method
		
		prop.load(fis);
     	
     String name = prop.getProperty("name");
     System.out.println(name);
     
     // Keys are case sensitive
     
     String lastname = prop.getProperty("lastName");
     System.out.println("Last name is: "+lastname);

     System.out.println("-----------------------------------");
     
    Set<Object> keys= prop.keySet();
    
    Collection<Object> values =prop.values();
    
    
    for(Object key: keys) {
    	System.out.println(key);
    }
    
    System.out.println("--------------------------------------");
    
    for(Object v: values) {
    	System.out.println(v);
    }
    
    
    
		
	}

}
