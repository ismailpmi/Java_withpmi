package pmi;

public class appnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer();
		String firstname="Mohammed";
		String lastname="ismail";
		sb.append(firstname);
		System.out.println("name:"+sb);
		int n=firstname.length();
		sb.insert(n, lastname);	
		System.out.println("fullname: "+sb);
		System.out.println("in reverse: "+sb.reverse());

}}
