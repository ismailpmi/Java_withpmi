package TestPack;

import java.util.Scanner;

interface pet{
	public String getName(String s);
	public void setName(String s);
	public void play();
	
}
abstract class Animals {
	int leg;

	public Animals() {
		super();
		
	}
	public void walk(){
		
	}
	public void eat(){
		
	}
}
class cat extends Animals implements pet{
	String name;
	public cat() {
		
		super();
	}
	public String getName(String s){
		Scanner sc=new Scanner(s);
		name=sc.next();
		return name;
		
	}
	@Override
	public void setName(String s) {
		// TODO Auto-generated method stub
		name=s;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("with ball");
	}
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Meat");
	}
}
class fish extends Animals implements pet{
	String name;
	public fish() {
		super();
		
	}
	
	
	public String getName(String s){
		Scanner sc=new Scanner(s);
		name=sc.next();
		return name;
		
	}
	@Override
	public void setName(String s) {
		// TODO Auto-generated method stub
		name=s;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("with water");
	}
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("feeds");
	}
	
	
}
abstract class Animal extends Animals implements pet{
	public void display(){
		getName(toString());
		setName(toString());
		play();
		eat();
	}
	
	Animals c=new cat(); 
	Animal aa=new Animal();
	Animals f=new fish();
	
	
	
}