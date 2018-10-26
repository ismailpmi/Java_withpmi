package pmi.test;

import pmi.model.InvalidException;

public class InvalidNumber extends Exception {

	public static void main(String[] args) throws InvalidException {
		// TODO Auto-generated method stub
		int len=args[0].length();
//		InvalidException ie=new InvalidException();
		if(len==10){
			System.out.println("Valid Numbers");
		}
		else{
			throw new InvalidException("Number is not equals to 10");
		}
	}

}
