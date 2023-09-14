package review11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		String projectPath= System.getProperty("user.dir");
		System.out.println(projectPath);
		
	    String filePath = projectPath+"/extra/demo.properties";
	    
	    System.out.println(filePath);
	    
	    FileInputStream fileIS = new FileInputStream(filePath);
	    
	    Properties proper = new Properties();
	    proper.load(fileIS);
	    
	    System.out.println(proper);
	    
	    //1st way
	    
	    Object firstName = proper.get("FirstName");
	    System.out.println(firstName);
	    
	    //2nd the correct way
	    
	    String school = proper.getProperty("School");
	    System.out.println(school);
	    
	    //I will get the age as a string because of the getProperty
	    
	    String age = proper.getProperty("age");
	    System.out.println(age);
	    
	    
	    proper.setProperty("SSN", "647-85-1236");
	    System.out.println(proper);
	    
	    
	    //re-assigning
	    
	    proper.setProperty("age", "28");
	    System.out.println(proper);
	    
	    
	    //Now let us save to another files
	    
	    String newPath = projectPath+"/extra/NewFile.txt";
	    
	    FileOutputStream fileOS = new FileOutputStream(newPath);
	    
	    proper.store(fileOS, "I'm very happy");
	    
	    System.out.println(proper);
	    
	    
	}

}
