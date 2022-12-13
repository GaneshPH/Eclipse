package com.xworkz.logic;


public class Loops {
	public static void main(String[] args) {
        // print hello word 5 times
		//for loop statements       		
		   System.out.println("hello");
		   System.out.println("hello");
		   System.out.println("hello");
		   System.out.println("hello");
		   System.out.println("hello");
		   
		   System.out.println("============================");
		   
		   for(int i=1;i<=5;i++) 
		   {
			   System.out.println("hello");
		   }
		   
		   System.out.println("============================");
		   
		   System.out.println(1);
		   System.out.println(2);
		   System.out.println(3);
		   System.out.println(4);
		   System.out.println(5);
		   
		   System.out.println("============================");
		   
		   for(int i=1;i<=5;i++)//initialization, condition,increment
		   {
			   System.out.println(i);
		   }
		   
		   System.out.println("============================");
		   
		   for(int i=5;i>=1;i--)
		   {
			   System.out.println(i);
		   }
		   
		   System.out.println("============================");
		   
		   //2 4 6 8 10
		   for(int i=2;i<=10;i=i+2)//i+=2
		   {
			   System.out.print(i+" ");  
		   }
		   
		   System.out.println("============================");
		   
		   //10 8 6 4 2
		   for(int i=10;i>=2;i-=2)//i=i-2
		   {
			   System.out.println(i);  
		   }
		   System.out.println("============================");
		   
		   for(int i=1;i<=15;i=i+3)
		   {
			   System.out.println(i);  
		   }
		   
		   System.out.println("============================");
		   
		   // adding sum of natural nos
		   int n=5;
		   int sum=0;
		    for(int i=1;i<=n;i++)
		    {
		    	sum=sum+i;//sum+=i;
		    }
		    System.out.println(sum);
		   
		   
		   System.out.println("============================");
		   
		   //2=while loop
	       /*while loop is a looping statements which keeps an executing until the condition is false.*/
	        //when loop is true while loop execute
	 	   int  n1=1;
		   
		   while (n1<=5)
		   {
			   System.out.println(n1);
			   n1++;
		   }
		   
		   System.out.println("&&&&&&&&&&&&&&&");
		   
		   int n2=5;
		   
		   while(n2>=1)
		   {
			   System.out.println(n2);
			   n2--;
		   }
		   
		   System.out.println("============================");
		   
//3=do while loop
	        //execute a set of instruction  and then check the condition 
	        // it execute at least once if it false
		   
		   int x=1;
		   
		   do
		   {
			   System.out.println(x);
			   x++;
		   }
		   while(x<=5);
		   
		   System.out.println("()()()()()()()()()()()()()()");
		   
		   int x1=5;
		   
		   do
		   {
			   System.out.println(x1);
			   x1--;
		   }
		   while(x1>=1);
		   
		   System.out.println("============================");
		   
//4= nested for loop
		   
		   for(int i1=1;i1<=3;i1++)  //outer for loop i=i1
		   {
			   for(int j1=5;j1<=6;j1++) //inner for loop j=j1
			   {
				   System.out.println("i1:"+i1 +" j1:"+j1);
			   }
		   }
		   System.out.println("============================");
		   
//* printer 4*4	   
		   for(int i2=1;i2<=4;i2++) 
		   {
		   for(int j2=1;j2<=4;j2++)
		   {
			  System.out.print("* "); 
		   }
		   System.out.println("*");
		   }
		   
	}
}
