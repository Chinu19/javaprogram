package java_practicals;

import java.util.Scanner;

public class Single_level {

	 static Scanner sc= new Scanner (System.in);
     static int n,rem,sum=0,k;
		public static void palindrome() {
		
	       System.out.println("Enter a number:");
	       n=sc.nextInt();
	       k=n;
	       while (n>0)
	       {
	    	   rem=n%10;
	    	   sum=sum*10+rem;
	    	   n=n/10;
	       }
	       
	      
	    if (k==sum)
	    {
	    	System.out.println("Its an palindrome number");
	    }
	    else 
	    {
	    	System.out.println("Its not an palindrome number");
	    }
	       
	}

}
