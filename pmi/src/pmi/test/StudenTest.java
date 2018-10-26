package pmi.test;

import java.util.Scanner;

import pmi.model.Studentinfo;

public class StudenTest {

	static Studentinfo[] SI=new Studentinfo[5];
	static int count;
	
	static Studentinfo getStudentinfo(){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Studentinfo Details:ID,Name,contact,course,fees");
	int id=sc.nextInt();
	String Name=sc.next();
	String contact=sc.next();
	String course=sc.next();
	int fees=sc.nextInt();
	
	Studentinfo student=new Studentinfo(id,Name,contact,course,fees);
	return student;
	}
	static void add(Studentinfo students){
		SI [count]=students	;
		count++;
	}
	static void view(){
		for(Employee e:Emp){
			System.out.println(e);
			
				}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
