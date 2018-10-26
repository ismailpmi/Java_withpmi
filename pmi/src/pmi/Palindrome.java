package pmi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		
		int length=input.length();
		String reverse="";
		int flag=1;
		for(int i=length-1;i>=0;i--){
			reverse=reverse+(input.charAt(i));
			}
		for(int i=0;i<length;i++){
			if(reverse.charAt(i)==input.charAt(i)){
			}
		else
		{
			flag=0;
		}
	}
		if(flag==1)
		{
			System.out.println("palindrome");
		}
		else if(flag==0){
			System.out.println("Not a palindrome");
		}
}
}