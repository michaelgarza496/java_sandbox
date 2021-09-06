package com.michael.innerclass;


interface Grade {
	char calcGrade(String studentId, int points);
	boolean studentExists(String studentId);
}


class Student2 {
	
	Grade grade = new Grade() {

		private char grade;
		
		@Override
		public char calcGrade(String studentId, int points) {
			if (points >= 90) {
				grade = 'A';
			} else if (grade >= 80) {
				grade = 'B';
			} else if (grade >= 70) {
				grade = 'C';
			} else {
				grade = 'F';
			}
			return grade;
		}

		@Override
		public boolean studentExists(String studentId) {
			// check DB
			return true;
		}
		
	};
	
	
	public char checkStudentGrade(String studentId, int points) {
		return grade.calcGrade(studentId, points);
	}
}


public class AnonymousClassDemo {

	public static void main(String[] args) {
		
		Student2 student = new Student2();
		String studentId = "ID001";
		char studentGrade = student.checkStudentGrade(studentId, 84);
		System.out.println("StudentId: " + studentId + "\tGrade: " + studentGrade);
	}

}
