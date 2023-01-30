package com.SerializableDeserializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {

	public static void main(String[] args) {
		
		// create object of class
		Student obj = new Student ();
		// call by object assign the value
		
		obj.fname = "Mayuri" ;
		obj.lname = "Shirsath" ;
		obj.city = "Nandurbar" ;
		// try and catch block
		
		try {
		// create object of FileOutputStream	
			FileOutputStream fos = new FileOutputStream ( "D:\\java.txt" );
			
			//create object of  ObjectOutputStream
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			
			//call write object through oos object
			oos.writeObject(obj);
			oos.flush();
			
			System.out.println(" Serialization is done...!!!");
		
		}
		catch ( Exception e) {
			System.out.println(e);
			
			
		}
		

	}

}
