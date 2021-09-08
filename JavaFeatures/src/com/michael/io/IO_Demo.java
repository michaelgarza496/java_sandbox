package com.michael.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IO_Demo {
	private static String fileName = "AvengerNames.txt";

	/**
	 * Creates a byte array from a string of names and writes it to a file
	 * using the FileOutputStream. This reads it character by character.
	 */
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
	
	/**
	 * This inputs a text file using the FileInputStream which reads the text
	 * one character at a time. This is useful only if there are no characters
	 * requiring more than a byte (16-bit Unicode).
	 */
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
	
	
	/**
	 * Reads a text file and writes to a new file with FileReader and FileWriter
	 * classes. This takes care of 16 bit characters if any. Reading a character
	 * one at a time is costly because of accesses to disc.
	 */
	public static void fileReaderAndWriterDemo() {
		
		try (Reader in = new FileReader(fileName);
				Writer out = new FileWriter("out.txt");) {
			
			int i = in.read();
			while (i != -1) {
				out.write(i);
				i = in.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Same as FileReader and FileWriter except the BufferedReader/Writer
	 * goes to buffer first to reduce the number of disc accesses.
	 */
	public static void bufferedReaderAndWriterDemo() {
		
		try (Reader in = new BufferedReader(new FileReader(fileName));
				Writer out = new BufferedWriter(new FileWriter("out.txt"));) {
			
			int i = in.read();
			while (i != -1) {
				out.write(i);
				i = in.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fileHandlerDemo() {
		File file = new File("AvengerNames.txt");
		File dir = new File(".");
		System.out.println("getName(): " + file.getName());
		System.out.println("getPath(): " + file.getPath());
		System.out.println("isDirectory(): " + file.isDirectory());
		System.out.println("getAbsolutePath(): " + file.getAbsolutePath());
		System.out.println("getAbsolutePath(): " + dir.getAbsolutePath());
		System.out.println("isDirectory(): " + dir.isDirectory());
		System.out.println();
		System.out.println("List of files...");
		String files[] = dir.list();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}

	
	public static void main(String[] args) {
		
//		fileOutputStreamDemo();
//		fileInputStreamDemo();
		//fileReaderAndWriterDemo();
		fileHandlerDemo();
	}

}
