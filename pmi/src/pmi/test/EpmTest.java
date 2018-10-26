package pmi.test;
import java.util.ArrayList;
import java.util.Scanner;

import pmi.model.*;
public class EpmTest extends Epm{
	static ArrayList<Employee> employeeList= new ArrayList<>();
	static void addEmployee(){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Details:ID,Name,address,Salary");
		int eid=sc.nextInt();
		String ename=sc.next();
		String address=sc.next();
		int sal=sc.nextInt();
		Employee employee=new Employee(eid,ename,address,sal);
		employeeList.add(employee);
	}
	static void findAll(){
		for(Employee e:employeeList){
			System.out.println(e);
			
				}
	}
		static boolean findById(int id){
			boolean isFound=false;
			for(Employee e:employeeList){
				if(e.getEmpid()==id){
					System.out.println(e);
					isFound=true;
					break;
				}
					}
			return isFound;
			
		}
		static void findByName(String name){
			
			for(Employee e:employeeList){
				if(e.getEmpName().equals(name)){
					System.out.println(e);
					
					break;
				}
					}
			
			
		}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter choice");
	int ch=sc.nextInt();
	
	switch(ch){
	case 1: {
			int i=0;
			while(i<2){
			addEmployee();
			
			i++;
		}
			findById(12);
			findByName("pmi");
			break;
		
	} 
//	case 2: {
//		
//		
//		break;
//	
//} 
	
	}
	
	
}
}
