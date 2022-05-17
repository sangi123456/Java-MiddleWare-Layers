package com.training.core.checked;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileOperations {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//String filePath = "D:\\projects\\testfiles\\myfile.txt";
		//FileOperationService.writeIntoFile(filePath);
	
		String filePath = "D:\\projects\\testfiles\\myfile.txt";
		FileOperationService.readFromFile(filePath);
		
		System.out.println("************************");
		
		String filePath1 = "D:\\projects\\testfiles\\myfile.txt";
		FileOperationService.writeIntoFileV1(filePath1);
	
		System.out.println("");
	
	}
}
