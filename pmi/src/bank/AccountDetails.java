package bank;

public class AccountDetails {
	long AccountNo;
	String Name;
	long ContactNo;
	public AccountDetails(long accountNo, String name, long contactNo) {
		super();
		AccountNo = accountNo;
		Name = name;
		ContactNo = contactNo;
	}

	public long getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(long accountNo) {
		AccountNo = accountNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getContactNo() {
		return ContactNo;
	}
	public void setContactNo(long contactNo) {
		ContactNo = contactNo;
	}
	
}
