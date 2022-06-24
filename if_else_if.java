package java_practicals;

import java.util.Scanner;

public class if_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc= new Scanner(System.in);
       int num1,num2,num3,num4;
       System.out.println("enter four numbers:");
       num1= sc.nextInt();
       num2= sc.nextInt();
       num3= sc.nextInt();
       num4= sc.nextInt();
       if (num1>num2 && num1>num3 && num1>num4)
       {
    	   System.out.println(num1+"is greater than the others");
       }
       else if (num2>num1 && num2>num3 && num2>num4)
       {
    	   System.out.println(num2+"is greater than others");
       }
       else if (num3>num1 && num3>num2 && num3>num4)
       {
    	   System.out.println(num3+"is greater than others");
       }
       else
    	   System.out.println(num4+"is greater than others");
       
	}

}
