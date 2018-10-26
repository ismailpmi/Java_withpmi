package pmi.model;

public class Employee {

	private int Empid;
	private String EmpName;
	private String Designation;
	private float Salary;
	public int getEmpid() {
		return Empid;
	}
	public Employee(int empid, String empName, String designation, float salary) {
		super();
		this.Empid = empid;
		this.EmpName = empName;
		this.Designation = designation;
		this.Salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + ", Designation=" + Designation + ", Salary="
				+ Salary + "]";
	}

}
