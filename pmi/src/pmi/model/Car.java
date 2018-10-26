package pmi.model;

public class Car {

	private int speed=100;
	private int numberOfGear=1234;
	public void drive(int speed,int numberofgear){
		this.speed=speed;
		this.numberOfGear=numberofgear;
	}
	void display(){
		System.out.println("speed of the car: "+speed);
		System.out.println("Number od Gears: "+numberOfGear);
	}
}

