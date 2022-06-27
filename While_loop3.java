package java_practicals;

import java.util.Scanner;

public class While_loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner (System.in);
       int n,rem,sum=0,k;
       System.out.println("Enter a number:");
       n=sc.nextInt();
       k=n;
       while (n>0)
       {
    	   rem=n%10;
    	   sum= sum+rem*rem*rem;
    	   n=n/10;
    	  
       }
    if (k==sum)
    {
    	System.out.println("Its an armstrong number");
    }
    else 
    {
    	System.out.println("Its not armstrong number");
    	
    }
    
    	
       
	}

}
