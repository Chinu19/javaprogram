package java_practicals;

import java.util.Scanner;

public class while_loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num,f=1;
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a number:");
       num=sc.nextInt();

    		   while(num>0)
    		   {
    			   f=f*num;
    			   num--;
    		   }
    		   System.out.println("the factorial is ="+f);
	}
}
 //num=sc.nextInt();
     //  int fact=1;
    //   int i=1;
      // while(i<=num)
      // {
    	//fact =fact*i;
    //	i++;
      // }
       //System.out.println("factorial of " +num+ "is:" +fact);
       
       
	//}


