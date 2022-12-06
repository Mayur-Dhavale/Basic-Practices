package com.fileinputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
	
	public static void main(String[] args) {
	    try {
	          //windows file path - D:\notes\abc.txt // not allowed
	          //Envalid escape sequence
	          String path = "D:\\notes\\abc.txt";
	          //or path = "D:/notes/abc.txt";
	          FileOutputStream fos = new FileOutputStream(path);
	          String s ="javabykiran Add- Karvenagar,pune";
	                byte b[] = s.getBytes();
	                fos.write(b);
	          System.out.println( "successfully written"); 
	          fos.close();
	    } 
	    catch (IOException e) { 
	           e.printStackTrace();
	    }	
	  }

}
