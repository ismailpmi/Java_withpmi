package pmi;

import java.util.Scanner;

public class GreatNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
//		int n=sc.nextInt();
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
			int max=arr[i];
			if(max<arr[i+1])
			{
				max=arr[i+1];
			}
			
		}
		String max = null;
		System.out.println("Greatest No "+max);
}
}