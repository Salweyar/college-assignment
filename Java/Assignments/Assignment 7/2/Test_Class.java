/*
 * ClassName:  Test_Class
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Assignment 7
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 08 - 04 - 2019
 * Last Updated:  08- 04 - 2019
 */

 public class Test_Class {

 	public static void main(String[] args) {

 		//testing AppUndergraduate class
 		AppUndergraduate a1 = new AppUndergraduate("Salweyar","RRC", 100, 3.80);
 		System.out.println(a1.getApplicationName());
 		System.out.println(a1.getCollegeName());
 		System.out.println(a1.getSatScore());
 		System.out.println(a1.getGpaScore() + "\n");

 		//testing Graduate class
 		Graduate g1 =new Graduate("Jack", "UFM","RRC");
 		g1.setCollegeOfOrigin("UFM");
 		System.out.println(g1.getApplicationName());
 		System.out.println(g1.getCollegeName());
 		System.out.println(g1.getCollegeOfOrigin());
 		System.out.println(g1.checkCollege());

 	}

}