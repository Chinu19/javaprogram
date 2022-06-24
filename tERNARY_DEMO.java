package java_practicals;

import java.util.Scanner;

public class tERNARY_DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,res ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		res=(num1>num2)?num1:num2;
		System.out.println("The greater no is ="+res);
	}

}
