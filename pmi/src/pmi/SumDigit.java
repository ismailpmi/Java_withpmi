package pmi;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int num=sc.nextInt();
		while(num!='\0'){
			int rem = num%10;
			s=s+rem;
			num=num/10;
		}
		System.out.println("The sum of digit: "+s);
	}

}
