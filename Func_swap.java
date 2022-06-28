package java_practicals;

import java.util.Scanner;

public class Func_swap {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 swapping();

	}
    public static void swapping()
    {
    	Scanner sc=new Scanner (System.in);
    	int num1,num2,temp;
    	System.out.println("Enter a number:");
    	num1=sc.nextInt();
    	num2=sc.nextInt();
    	System.out.println("Before swapping the value of num1 is:"+num1+"and num2 is"+num2);   	
    	temp=num1;
    	num1=num2;
    	num2=temp;
    	System.out.println("After swapping the value of num1 is:"+num1+"and num2 is"+num2);  
    	
    	
    }
}
