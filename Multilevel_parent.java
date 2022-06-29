package java_practicals;

import java.util.Scanner;

public class Multilevel_parent {
	 static Scanner sc=new Scanner (System.in);
	static int num1,num2,temp,n1,n2,res;

public static void addition()
{
	
	 System.out.println("enter two numbers:");
	 n1=sc.nextInt();
	 n2=sc.nextInt();
	 res=n1+n2;
	 System.out.println("The addition of two number ="+res);
}
public static void swapping() 
{
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
