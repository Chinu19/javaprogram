package java_practicals;

import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Numbers");
		num1=sc.nextInt();
		
		
		num2=num1;
		System.out.println("The num is ="+num2);
		
		num2+=num1;
		System.out.println("The num is ="+num2);
		
		num2-=num1;
		System.out.println("The num is="+num2);
		
	    num2*=num1;
		System.out.println("The num is ="+num2);
		
		num2/=num1;
		System.out.println("The num is ="+num2);
		
		num2%=num1;
		System.out.println("The num is ="+num2);
	}

}
