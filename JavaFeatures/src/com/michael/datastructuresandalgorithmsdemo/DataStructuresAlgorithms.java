package com.michael.datastructuresandalgorithmsdemo;

public class DataStructuresAlgorithms {

	public static void deleteElementArr(char[] a, int pos) {
		// traverse the array and start at the position that wants deleting
		for (int i = pos-1; i < a.length-1; i++) {
			a[i] = a[i+1];
		}
		// set last char '0'
		a[a.length-1] = '0';
	}
	
	public static void insertElementArr(char[] a, int pos, char value) {
		// traverse starting at end
		for (int i = a.length-1; i >= pos; i--) {
			a[i] = a[i-1];
		}
		a[pos-1] = value;
	}
	
	
	
	public static void main(String[] args) {
		
		char a[] = new char[6];
		a[0] = 'A';
		a[1] = 'B';
		a[2] = '}';
		a[3] = 'D';
		a[4] = 'E';
//		a[5] = 'E';
		
//		System.out.println(a);
//		deleteElementArr(a, 3);
//		System.out.println(a);
		
		System.out.println(a);
		insertElementArr(a, 3, 'C');
		System.out.println(a);
	}

}
