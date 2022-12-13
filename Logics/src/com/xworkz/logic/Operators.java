package com.xworkz.logic;

public class Operators {
	public static void main(String[] args) {
		
		// 1=arithmetic operator
				int a=5;
				int b=10;
				int sum =a+b;
				int sub = a-3;
				System.out.println("sum:"+sum);//string +any thing is concatenation
				System.out.println("Sub :" + sub);
				System.out.println("Multi :"      +4*b);
				System.out.println("Div : " +10/5);
				System.out.println("Per :" +10%2);
				
				System.out.println("--------------------------------------------");
				
		// 2=assignment operators
				
				int x= 10;
				System.out.println("value of x= "+x);
				
				x+=20;  //x+=20 == x=x+20 x=10+20
				System.out.println("value of x= "+x);
				
				System.out.println("&&&&&&&&&&&"); 
				
				int i=45;
				System.out.println("value of i:"+i);
				
				i-=13;//i=i-13 i=45-13
				System.out.println("value of i:"+i);
				
				System.out.println("------------------------------------------");
				
		//3= comparison operators
				            //== is for comparison two values a==5
		                    //= is for assigning the data a=5
				int y=10;
				int z=20;
				System.out.println(y<z);  //true
				System.out.println(y<=5);  //false
				
				System.out.println("&&&&&&&&&&&");
				
				System.out.println(z>50); //false
				System.out.println(z>=10); //true
				
				System.out.println("&&&&&&&&&&&");
				
				System.out.println(y==z);  //false
				System.out.println(y!=z);  //true
				System.out.println(y==10);  //true
				System.out.println(y!=10);   //false
			
				System.out.println("-----------------------------------------------");
				
		// 4= logical operators
				// and, or,not
				int c=1;
				int d=2;
				boolean result=c<d && c==1;
				System.out.println(result);       //true
				System.out.println(c<=4 && c==d); //false
				
				System.out.println("&&&&&&&&&&&&&");
				
				System.out.println(c<5 || d==5);  //true 
				System.out.println(c==d || d!=2); //false
				
				System.out.println("&&&&&&&&&&&");
				
				System.out.println(!true); 
				System.out.println(!false); 
				System.out.println(!(1<2));
				System.out.println(!(20<5));
				
				System.out.println("--------------------------------------------"); 
				
		// 5= unary operators
				               //++  =  increment by 1
				               //--  = decrement by 1
				 int x1=5;                                
				 System.out.println("x1:"+x1);//5       
				 
				 x1++;
				 System.out.println("x1:"+x1);//6
				 
				 x1++;
				 System.out.println("x1:"+x1);//7
				 
				 x1--;
				 System.out.println("x1:"+x1);//6
				 
				 x1--;
				 System.out.println("x1:"+x1);//5
				 
				 System.out.println("&&&&&&&&&&&&&&");
				 
				
				 int i1=40;
				 int j1=i1++;//post increment =first assign-> after increment
				 System.out.println(i1+" "+j1);//41 40
				 
				 int i2=5;
				 int j2=--i2;//pre decrement =first decrement-> after assign
				 System.out.println(i2+" "+j2); // 4 4 
				 
				 int i3=10;
				 int j3=i3--;//post decrement
				 System.out.println(i3+" "+j3);// 9 10
				 
				 int i4=10;
				 int j4=++i4;
				 System.out.println(i4+" "+j4);//11 11
				 
				  System.out.println("-----------------------------------------");
				  
		//6= ternary operators
			      int p=10;
			      int q=3;
			      int max= p>q ? p:q;//true
				  System.out.println("maximum of "+p+" & "+q+" is "+max);//p
				  
				  System.out.println("&&&&&&&&&&&&&&");
				  
				  int p1=10;
			      int q1=20;
			      int max1= p1>q1 ? p1:q1;//false
				  System.out.println("maximum of "+p1+" & "+q1+" is "+max1);//q
				  
				  System.out.println("--------------------------------------------");
			}

}
