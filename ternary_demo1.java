package java_practicals;

import java.util.Scanner;

public class ternary_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int res;
		res=(num%2==0)?num*num:num*num*num;
		System.out.println("The result ="+res);
				
		

	}

}
