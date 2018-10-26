package pmi.test;

import pmi.model.Division;

public class DivisionTest extends Exception{
		static int x=3;
		static int y=0;
	public static void main(String[] args) throws Division  {
		// TODO Auto-generated method stub
		//String len=args[0];
		int value=x/y;
		//int le=Integer.parseInt(len);
		try{
			if(y==0){
				throw new Division("/ by zero"); 
			}
		}
		catch(ArithmeticException ae){

		}
		
		
		
	}
}
