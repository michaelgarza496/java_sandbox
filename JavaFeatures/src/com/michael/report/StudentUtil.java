package com.michael.report;

import java.util.Map;

public final class StudentUtil {
	final String ENG = "English";
	final String MATH = "Math";
	final String SCI = "Science";
	
	public static void addCourseGrades(Student student, String[] subjectAndGrades) {
		Map<String, Integer> term;
		if (subjectAndGrades[1].equals("Term1"))
			term = student.getTerm1();
		else
			term = student.getTerm2();
		
		for (int i = 2; i < subjectAndGrades.length; i += 2)
			term.put(subjectAndGrades[i], Integer.parseInt(subjectAndGrades[i+1]));
	}
}
