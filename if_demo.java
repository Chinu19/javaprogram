package java_practicals;

import java.util.Scanner;

public class if_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1,res;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        num1=sc.nextInt();
        if(num1%7==0)
        {
          System.out.println("It is divisible by 7");
          res=num1*num1;
          System.out.println("square of the no. is :"+res);
        }
        
        
        
        		
	}

}
