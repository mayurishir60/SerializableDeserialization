package com.SerializableDeserializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {

	public static void main(String[] args) {
		try {
			// create object of FileInputStream
			FileInputStream fis = new FileInputStream ( "D:\\java.txt");
			
			// create object of ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream (fis);
			
			 Object o = ois.readObject() ;  // read object
			 
			 // convert to student 
			 Student obj = (Student) o;
			 
			 System.out.println(obj.fname);
			 System.out.println(obj.lname);
			 System.out.println(obj.city);
			 ois.close();
			
		}
		
		catch (Exception e) {
			System.out.println(e);
					
		}
	}
}
