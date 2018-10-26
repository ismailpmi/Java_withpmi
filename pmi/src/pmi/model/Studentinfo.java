package pmi.model;

public class Studentinfo 
{
		int sid,fees,contactNo;
		String name,course;
		public Studentinfo(int id, String name2, String contact, String course2, int fees2) {
			// TODO Auto-generated constructor stub
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public int getFees() {
			return fees;
		}
		public void setFees(int fees) {
			this.fees = fees;
		}
		
		public int getContactNo() {
			return contactNo;
		}
		public void setContactNo(int contactNo) {
			this.contactNo = contactNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		
		@Override
		public String toString() {
			return "Studentinfo [sid=" + sid + ", fees=" + fees + ", contactNo=" + contactNo + ", name=" + name
					+ ", course=" + course + "]";
		}
}
