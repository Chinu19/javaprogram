package java_practicals;

import java.util.Scanner;

public class arithmetic_ 
{
	public static void main(String[] args) 
	{
		int num1,num2,res ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		res=num1+num2;
		System.out.println("The add is ="+res);
		
		res=num1-num2;
		System.out.println("The sub is ="+res);
		
		res=num1*num2;
		System.out.println("The mul is="+res);
		
		res=num1/num2;
		System.out.println("The div is ="+res);
		
		res=num1%num2;
		System.out.println("The mod is ="+res);
	}
}
