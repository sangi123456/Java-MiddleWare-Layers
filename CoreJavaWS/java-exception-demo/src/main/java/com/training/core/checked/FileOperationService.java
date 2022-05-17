package com.training.core.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperationService {

public static void writeIntoFile(String filePath) {
		
		File file = new File(filePath);
		FileOutputStream fos = null;
		
		try 
		{
			 fos = new FileOutputStream(file); 
			 System.out.println("File Exists for writing...");//constrcutor method has a checked exception
		 } 
		 catch (FileNotFoundException e)
		 {
		    System.err.println("file not found on the specified path ");
		 }
		String str = new String("This data is ");
		byte[] arr = str.getBytes();
		
		try {
			fos.write(arr);
		} catch (IOException e) {
		  e.printStackTrace();
		}
		//finally- to perform the clean up task
		finally {
			try {
				fos.close();
			}catch(IOException e) {
				 e.printStackTrace();
			}
		}
			
		
	}
	
	public static void writeIntoFileV1(String filePath) throws FileNotFoundException, IOException {

		File file = new File(filePath);
		FileOutputStream fos = null;

       fos = new FileOutputStream(file); // constructor method has a checked exception
		System.out.println("File Exists for writing....");

       String str = new String("This data is written from the FileOutputStream object");
		byte[] arr = str.getBytes();

		fos.write(arr);
		fos.close();
	}

   public static void readFromFile(String filePath) {
	
	   File file = new File(filePath);
	FileInputStream fis = null;
	long numberofChar = file.length();
	byte[] arr = new byte[(byte)numberofChar];
	
	try {
		fis = new FileInputStream(file);
		fis.read(arr);
		//convert byte iinto string
		String str = new String(arr);
		System.out.println("Data from file... ");
		System.out.println(str);
			
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	
	}finally {
		try {
			fis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
  }
}
//System.out.println("File Exists - " + file.exists());
//System.out.println("is a file - " + file.isFile());
//System.out.println("is a Directory - " + file.isDirectory());
//System.out.println("Can read - " + file.canRead() + " Write - " + file.canWrite());
