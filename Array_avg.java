package Array;

import java.util.Scanner;

public class Array_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//avg();
		//smallest();
		//decending();
		ascending();

	}
    public static void avg()
    {
    	int sum =0;
    	Scanner sc=new Scanner(System.in);
    	int[] num=new int[5]; 
    	System.out.println("Enter 5 numbers:");
    	for(int i=0;i<5;i++)
    	{
    		num[i]=sc.nextInt();
    	}
    	for(int i=0;i<5;i++)
    	{
    		sum=sum+num[i];
    	}
    	System.out.println("The average of all the numbers is :"+sum/5);
    }

    public static void smallest()
    {
    	int sum =0;
    	Scanner sc=new Scanner(System.in);
    	int[] num=new int[5]; 
    	System.out.println("Enter 5 numbers:");
    	for(int i=0;i<5;i++)
    	{
    		num[i]=sc.nextInt();
    	}
    	
    		int temp=num[0];
    		for (int i=0; i<5;i++)
    		{
    			if (temp>num[i])
    			{
    				temp=num[i];
    				
    			}
    		
    	}
    		System.out.println("The smallest of all numbers is:"+temp);
    }
    
         
     public static void decending()
    {
    	int sum =0;
    	Scanner sc=new Scanner(System.in);
    	int[] num=new int[5]; 
    	System.out.println("Enter 5 numbers:");
    	for(int i=0;i<5;i++)
    	{
    		num[i]=sc.nextInt();	
    	}
    	int temp;
    	for(int i=0;i<5;i++)
    	{
         for(int j=0;j<5;j++)
         {
    		if (num[i]>num[j])	
    		{
    			temp =num[i];
    		    num[i]=num[j];
    		    num[j]=temp;
    		}
    	}
    	}
    	System.out.println("decending no. is ");
         for(int i=0;i<5;i++)
         {
        	System.out.println(num[i]); 
    	
    }
    }
         
public static void ascending()
{
	int sum =0;
	Scanner sc=new Scanner(System.in);
	int[] num=new int[5]; 
	System.out.println("Enter 5 numbers:");
	for(int i=0;i<5;i++)
	{
		num[i]=sc.nextInt();	
	}
	int temp;
	for(int i=0;i<5;i++)
	{
     for(int j=0;j<5;j++)
     {
		if (num[i]<num[j])	
		{
			temp =num[i];
		    num[i]=num[j];
		    num[j]=temp;
		}
	}
	}
	System.out.println("ascending no. is ");
     for(int i=0;i<5;i++)
     {
    	System.out.println(num[i]); 
	
}
}
     }
