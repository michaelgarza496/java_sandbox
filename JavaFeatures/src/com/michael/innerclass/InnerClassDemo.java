//package com.michael.innerclass;
//
//public class InnerClassDemo {
//
//	public static void main(String[] args) {
//		Student student = new Student();
//		String studentId = "ID001";
//		char gradePoint = student.checkStudentGrade(studentId, 84);
//		System.out.println(student);
//
//	}
//
//}
//
//
//class Student {
//	private String studentId;
//	private Grade grade;
//	
//	public Student() {
//		grade = new Grade();
//	}
//	
//	private class Grade {
//		private char grade;
//		
//		private char calcGrade(String studentId, int points) {
//			if (points >= 90) {
//				grade = 'A';
//			} else if (grade >= 80) {
//				grade = 'B';
//			} else if (grade >= 70) {
//				grade = 'C';
//			} else {
//				grade = 'F';
//			}
//			setStudentId(studentId);
//			return grade;
//		}
//	}// end inner class
//	
//	public char checkStudentGrade(String studentId, int points) {
//		return new Grade().calcGrade(studentId, points);
//	}
//	
//	private void setStudentId(String id) {
//		this.studentId = id;
//	}
//	
//	@Override
//	public String toString() {
//		return "StudentId: " + studentId + "\tGrade: " + grade.grade;
//	}
//}