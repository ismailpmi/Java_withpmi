package pmi;

public class StaticDemo {
	static{
		System.out.println("Static block");
	}
	{
		System.out.println("Instance blk1");
		instMethod();
		staticMethod();
	}

	void instMethod() {
		System.out.println("InstMethod");
	}

	static void staticMethod() {
		System.out.println("Static method");
	}
	static {
		System.out.println("Static block 2");
		staticMethod();
		StaticDemo sd=new StaticDemo();
		sd.instMethod();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main");
		
	}
	static {
		System.out.println("Static block 3");
	}
}
