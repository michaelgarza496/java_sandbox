package com.michael.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Demo {
	private static String fileName = "AvengerNames.txt";

	public static void fileOutputStreamDemo() {
		try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)){
			String names = "IronMan Hawkeye AntMan BlackWidow CaptAmerica Hulk Thor";
			byte byteArr[] = names.getBytes();
//			System.out.println(byteArr[1]);
			fileOutputStream.write(byteArr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fileInputStreamDemo() {
		
		try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
		
			
			int i = fileInputStream.read();
			while (i != -1) {
				System.out.print((char)i);
				i = fileInputStream.read();
			}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
//		fileOutputStreamDemo();
		fileInputStreamDemo();
	}

}
