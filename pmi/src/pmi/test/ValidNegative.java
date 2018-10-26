package pmi.test;

public class ValidNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=0;
		
				try{
					if(v>0 && v<100){
						System.out.println("not a negtive ");
					}
					else{
						throw new Exception("enter valid number between 0-100");
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				
				
	}

}
