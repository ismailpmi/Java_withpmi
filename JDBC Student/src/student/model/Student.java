package student.model;

public class Student {
	int student_id;
	String student_name;
	String department;
	int mark1;
	int mark2;
	int mark3;
	public Student(int student_id, String student_name, String department, int mark1, int mark2, int mark3) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.department = department;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", department=" + department
				+ ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + "]";
	}

	
}
