package javaprojects.java;

public class shapes {

	public static void main(String[] args) {

		for(int i=0; i<4; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
//P-2
		
		for(int i=3; i > 0; i--) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
//P-3
		int alphabet = 65; //A
		
		for(int i=0; i<4; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print((char) alphabet);
				alphabet = alphabet+1;
			}
			System.out.print("\n");
		}
			
	   }

}