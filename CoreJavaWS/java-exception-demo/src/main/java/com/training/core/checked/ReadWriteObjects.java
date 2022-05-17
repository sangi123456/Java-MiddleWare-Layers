package com.training.core.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObjects {

    private static ObjectInputStream ois;


	public static void addNewObject(Person p, String filePath) {

       File f = new File(filePath);
       
       try {
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(p);
        System.out.println("Object written iin file");
          } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
           e.printStackTrace();
         }
     }
    
    
    public static void readObject(Person p, String filePath) {

        File f = new File(filePath);
         try {
         FileInputStream fis = new FileInputStream(f);
         try {
			ObjectInputStream oos = new ObjectInputStream(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         Person person = null;
		try {
			person = (Person) ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          System.out.println("Object read from file - " + person.getId() + " " + person.getName() + " " + person.getAge());
         } catch (FileNotFoundException e) {
            e.printStackTrace();
          } catch (ClassNotFoundException e) {
            e.printStackTrace();
          }
    
    }


	public static void readObject(String filePath) {
		// TODO Auto-generated method stub
		
	}
}
