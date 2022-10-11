package com.java11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountStudent {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\AKRUSHNA\\Desktop\\E-vehical\\Java11Assignments_StudentList.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;

		while ((st = br.readLine()) != null)

			System.out.println(st);

	}

}
