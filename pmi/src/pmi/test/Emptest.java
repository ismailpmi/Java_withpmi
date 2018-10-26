package pmi.test;

import pmi.model.Employee;

public class Emptest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee employee=new Employee();
			employee.setEmpid(2322);
			employee.setEmpName("Ismail");
			employee.setDesignation("Developer");
			employee.setSalary(25000f);;
			System.out.println(employee);
			System.out.println("Name of the employee= "+employee.getEmpName());
			
	}
	
}
