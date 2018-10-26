package pmi;

public class PrimeRnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=Integer.parseInt(args[0]);
		if(n==0 || n==1){
			System.out.println("Not a prime number");
		}
		for(int i=2;i<n/2;i++){
			if(n%i==0){
			System.out.println(args[0]+" Not a prime");	
		break;
			}
			else{
			System.out.println(args[0]+" It's a prime number");	
		break;	
			}
			
		}
	}

}
