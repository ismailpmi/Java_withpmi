package pmi.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pmi.model.Employee;

public class Capitals {
	
	static List<String> cap= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cap.add("chennai");
		cap.add("Delhi");
		cap.add("Mumbai");
		cap.add("banglore");
		
		Iterator it=cap.iterator();
		while(it.hasNext()){
			if(cap.size()<5){
				System.out.println("captial cities"+cap);
			}
			break;
		}
	}

}
