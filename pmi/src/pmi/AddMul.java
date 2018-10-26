package pmi;

import java.util.Scanner;

public class AddMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddOpr AO=new AddOpr();
		Mulopr MO=new Mulopr();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num1: ");
		int num2=sc.nextInt();
		int addition=AO.AddOp(num1, num2);
		int multiply=MO.Mult(num1, num2);
		System.out.println("--add="+addition+"--mul="+multiply);
	
		
//		AddOpr AO= new AddOpr();
//		Mulopr MO= new Mulopr();
		
//		AO.AddOpr
//		System.out.println(AO+"add&mul"+MO);
//		
	}
	



}
