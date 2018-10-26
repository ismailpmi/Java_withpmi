package TestPack2;
import TestPack.ExtTest;
import TestPack.TestingPack;

public class TestPacking extends TestingPack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingPack tp=new ExtTest();
		int A=tp.a;
//		int B=tp.b;
//		int C=tp.c;
//	    int H=tp.h;
		System.out.println("A variable'public' can be access "+A);
		System.out.println("B variable'protected' can't be access ");
		System.out.println("c variable'default' can't be access ");
		System.out.println("H variable can't be access which is private of other class ");
	}
}
