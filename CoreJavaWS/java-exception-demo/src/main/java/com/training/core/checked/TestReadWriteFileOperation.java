package com.training.core.checked;

public class TestReadWriteFileOperation {
	
   public static void main(String[] args) {
	   
	   String filePath =" D:\\projects\\testfiles\\myobjectfile.txt";
	   Person p = new Person(11, "sangita", 24 );
	
	ReadWriteObjects.addNewObject(p, filePath);
	
	ReadWriteObjects.readObject(filePath);
}
}
