package pmi.test;

import TestPack.ExtTest;
import TestPack.TestingPack;

class Animal{ 
	
	public String animalName;
	public int Legs;
	void shout(){
		System.out.println("shout");
		}	
	
 }
class dog extends Animal  {
	
	 void shout(){
		System.out.println("bahubahu");
		}	
	}
class horse extends Animal {
		
		void shout(){
		System.out.println("heheeh");
		}	
	}
class cat extends Animal{
	
		 void shout(){
			System.out.println("miyauuun");
		}	
	}
	
class AnimalTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aa=new dog();
		System.out.println("Shout of dog be like");
		aa.shout();
		aa=new cat();
		System.out.println("Shout of cat be like");
		aa.shout();
		aa=new horse();
		System.out.println("Shout of horse be like");
		aa.shout();
		
		
	}
}
