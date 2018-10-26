package pmi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int b=1;
		System.out.println("Enter the number a: ");
		int a=sc.nextInt();
		do{
			b*=a;
			--a;
		}while(a>0);
		System.out.println("some of factorial is: "+b);
	
	}

}
