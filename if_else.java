package java_practicals;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner (System.in);
       int num,res;
       System.out.println("Enter a number:");
       num= sc.nextInt();
       if (num%7==0)
       {
    	   System.out.println("It is divisible by 7");
    	   res=num*num;
    	   System.out.println("square of the number is :"+res);
       }
       else 
       {
    	   System.out.println("It is not divisible by 7");
    	   res=num*num*num;
    	   System.out.println("cube of the no. is :"+res);
    	   
    	   
       }
    		   
	}

}
