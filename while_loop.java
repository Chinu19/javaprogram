package java_practicals;

import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int min,max;
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter a minimum value:");
       min=sc.nextInt();
       
       System.out.println("Enter a maximum value:");
       max=sc.nextInt(); 
       
       while (min<=max)  
       {
    	 System.out.println(min);
    	 min++;
       
    		   
	}
	}
}
