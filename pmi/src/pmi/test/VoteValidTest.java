package pmi.test;
import pmi.model.InvalidException;
import pmi.model.VoteValidException;

public class VoteValidTest extends Exception {

	public static void main(String[] args) throws VoteValidException {
		// TODO Auto-generated method stub
		String len=args[1];
		int le=Integer.parseInt(len);
		if(le<=60||le>=18){
			System.out.println("Valided ");
		}
		else{
			throw new VoteValidException("the age required more/less", null);
		}
	}
	}


