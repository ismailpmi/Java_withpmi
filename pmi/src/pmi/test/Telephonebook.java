package pmi.test;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import pmi.model.Employee;

public class Telephonebook {
	static HashMap<String,String> cap= new HashMap<>();
	static void findAll(){
		for(String e:cap.keySet()){
			System.out.println(e);
			
				}
	}
	static void findByName(String name){
		Iterator i=cap.keySet().iterator();
		while(i.hasNext()){
		String s=(String)i.next();
		
		
			if(s.equals(name)){
				System.out.println("Name of="+s+i+" ");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cap.put("kumar", "9990000");
		cap.put("Ravi"," 8890800");
		cap.put("pmi", "9990777");
		cap.put("moham", "2220004");
		cap.put("kabir", "8589000");
		
		findAll();
		findByName("pmi");

}
}
