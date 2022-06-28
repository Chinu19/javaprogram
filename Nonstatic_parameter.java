package java_practicals;

import java.util.Scanner;

public class Nonstatic_parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonstatic_parameter obj=new Nonstatic_parameter ();
		obj.parameteraccept();
	
	}
     public void parameteraccept()
     {
    	 Scanner sc=new Scanner (System.in);
    	 int num1,num2;
    	 System.out.println("enter two numbers:");
    	 num1=sc.nextInt();
    	 num2=sc.nextInt();
    	 add(num1,num2);
     }
     public void add(int n1,int n2)
     {
     int res;
   	 res=n1+n2;
   	 System.out.println("THe addition of two numbers is "+res);
     sub(n1,n2);
     }    
     
     public static void sub(int n1,int n2)
     {
     	int res;
     	res=n1-n2;
     	System.out.println("Subtraction of two numbers is="+res);
     	div(n1,n2);
     }
     public static void div(int n1,int n2)
     {
     	int res;
     	res=n1/n2;
     	System.out.println("Division of two numbers is="+res);
     	mul(n1,n2);
     }
     public static void mul(int n1,int n2)
     {
     	int res;
     	res=n1*n2;
     	System.out.println("Multiplication of two numbers is="+res);
     	mod(n1,n2);
     }
     public static void mod(int n1,int n2)
     {
     	int res;
     	res=n1%n2;
     	System.out.println("modulus of two numbers is="+res);
     }
}

