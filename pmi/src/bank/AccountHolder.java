package bank;

public class AccountHolder extends AccountDetails {

	int accountType;
	double balance;
	public AccountHolder(long accountNo, String name, long contactNo,int accountType,double balance) {
		super(accountNo, name, contactNo);
 	this.accountType = accountType;
		this.balance = balance;
	}
	
//	public AccountHolder() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public AccountHolder(long accountNo, String name, long contactNo) {
//		super(accountNo, name, contactNo);
//		// TODO Auto-generated constructor stub
//	}
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountHolder [accountType=" + accountType + ", balance=" + balance + ", AccountNo=" + AccountNo
				+ ", Name=" + Name + ", ContactNo=" + ContactNo + "]";
	}
	
}
