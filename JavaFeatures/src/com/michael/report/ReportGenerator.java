package com.michael.report;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReportGenerator {
	static final Logger log = Logger.getLogger(ReportGenerator.class.getName());
	static final Map<String, Student> students = new HashMap<>();

	public static void main(String[] args) {
		String filename = args[0];
		readGradesData(filename);
		
	}
	
	public static boolean isValidData(String line) {
		Pattern regex = Pattern.compile("\\w+\\s\\w+:(Term\\d)+.*");
		Matcher matcher = regex.matcher(line.trim());
		return matcher.matches();
	}
	
	public static void readGradesData(String filename) {
		try (BufferedReader inFile = new BufferedReader(new FileReader(filename))) {
			String line;
			Student student;
			while ((line = inFile.readLine()) != null) {
				if (!isValidData(line))
					continue;
				
				String[] lines = line.split(":");
				if (students.containsKey(lines[0]))
					student = students.get(lines[0]);
				else {
					student = new Student(lines[0]);
					students.put(lines[0], student);
				}
				StudentUtil.addCourseGrades(student, lines);
				
				//log.log(Level.INFO,student.toString());
				System.out.println(student);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Wrong file path and/or name");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
