package pmi;

import java.util.Scanner;

public class StringOpertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1");
		String str=sc.next();
		System.out.println("Enter string2");
		String str2=sc.next();
		System.out.println(str.length()+" the length of string");
		System.out.println(str.replaceAll(str, str2)+" replaced hello");
		System.out.println(str.trim()+" triming of string");
		System.out.println(str.concat(str2)+" concardination of two strings");
//		System.out.println(str2.replace('hello')+"replacing string");
		System.out.println(str.toUpperCase()+"   Uppercase convertion");
		System.out.println(str.indexOf('e')+" indexing of string");
		System.out.println(str.charAt(3)+" character of string");
		System.out.println(str.compareToIgnoreCase(str2)+" compare to ignorecase of string");
		
	}

}
