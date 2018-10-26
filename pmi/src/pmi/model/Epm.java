package pmi.model;

public class Epm {

	int eid;
	String ename;
	String address;
	int sal;
	public Epm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Epm(int eid, String ename, String address, int sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Epm [eid=" + eid + ", ename=" + ename + ", address=" + address + ", sal=" + sal + "]";
	}
	
	
	
}
