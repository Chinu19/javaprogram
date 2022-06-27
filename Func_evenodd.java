package java_practicals;

import java.util.Scanner;

public class Func_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenodd();
		positivenegative();
		
	}
	public static void evenodd()
	{
		 Scanner sc= new Scanner (System.in);
	      int num;
	     System.out.println("Enter a number:");
	     num=sc.nextInt();
	     if (num%2==0) {
	    	 System.out.println("Its an even number");
	     
	     }
	     else 
	     {
	    	 System.out.println("Its an odd number");
	     }
	    	 
	}
	
     public static void positivenegative()
     {
    	 Scanner sc=new Scanner(System.in);
    	 int num1;
    	 System.out.println("Enter a number:");
    	 num1=sc.nextInt();
    	 if(num1>0)
    	 {
    	 System.out.println("Its a positive number");
     }
    	 else if (num1==0)
    	 {
    		 System.out.println("Its a neutral number");
    	 }
    	 else 
    	 {
    		 System.out.println("Its a negative number");
    	
    	 }
     }
}

