package java_practicals;

import java.util.Scanner;

public class Func_3_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse();
		fact();
		greater();
		
	}
   public static void greater()
   {
	   Scanner sc=new Scanner (System.in);
	   int num1,num2,num3,res;
	   System.out.println("enter three numbers :");
	   num1=sc.nextInt();
	   num2=sc.nextInt();
	   num3=sc.nextInt();
	 
	  
	   if (num1>=num2) 
	   {
		System.out.println("THis number is greater: "+num1);   
	   }
	   else if (num2>num3)
	   {
		   System.out.println("THis number is greater: "+num2); 
	   }
	   else  
	   {
		   System.out.println("THis number is greater: "+num3); 
	   }
	   
	   }
   public static void fact()
   {
	   int num1,f=1;
	   Scanner sc= new Scanner (System.in);
	   System.out.println("Enter a number:");
	   num1=sc.nextInt();
	   while (num1>0)
	   {
		   f=f*num1;
		   num1--;
	   }
	   System.out.println("the factorial is "+f);
   }
     public static void reverse()
     {
    	 int num1,k,rem,sum=0;
    	Scanner sc=new Scanner (System.in);
	       System.out.println("Enter a number:");
	       num1=sc.nextInt();
	       k=num1;
	       while (num1>0)
	       {
	    	   rem=num1%10;
	    	   sum=sum*10+rem;
	    	   num1=num1/10;
	    	  
	       }
	       System.out.println("the reverse is :"+sum);
	       {
	    	   
	       }
   	{
   		
   	}
     }
     
}
