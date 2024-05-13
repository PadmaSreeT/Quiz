package ram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class q1 extends Thread
{ 
	int b1=0;
	  public void run()
	  {
		  for(int s=0;s<1;s++)
		  {
			  try
			  {
				  q1.sleep(1000);
        System.out.println("1. Who invented Java Programming?\n"+
        	    "1) Guido van Rossum\n"+
        		"2) James Gosling\n"+
        		"3) Dennis Ritchie\n"+
        		"4) Bjarne Stroustrup");
			  }
			 catch(NumberFormatException | InterruptedException e)
	    	 {
	    		  System.out.println(e);   
	    		 }
	         }
	   }
}
      class q2  extends Thread
      {
    	  int b2=0;
    	  public void run()
    	  {
    		  for(int s=0;s<1;s++)
    		  {
    			  try
    			  { 
    				  q2.sleep(5000);
              System.out.println("2. Which component is used to compile, debug and execute the java programs?\n"+
					 "1) JRE\n"+
					 "2) JIT\n"+
					 "3) JDK\n"+
					 "4) JVM");
			 
    			  }
				 catch(NumberFormatException | InterruptedException e)
		    	 {
		    		  System.out.println(e);   
		    		 }
		         }
    	  }
		   }
      class q3 extends Thread
      {
    	  int b3=0;
    	  public void run()
    	  {
    		  for(int s=0;s<1;s++)
    		  {
    			  try
    			  {
    				  q3.sleep(5000);
			System.out.println("3. Which of these cannot be used for a variable name in Java?\n"+
					"1) identifier & keyword\n"+
					"2) identifier\n"+
					"3) keyword\n"+
					"4) none of the mentioned");
			
				 }
 				 catch(NumberFormatException | InterruptedException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      }
 		   }
       class q4 extends Thread
       {
    	   int b4=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
     				 q4.sleep(5000);
			System.out.println ("4. What is the extension of java code files?\n"+
					 "1) .js\n"+
					 "2) .txt\n"+
					 "3) .class\n"+
					 "4) .java");
            
     			 }
 				 catch(NumberFormatException | InterruptedException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      }
 		   }
       class q5 extends Thread
       {
    	   int b5=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
     				 q5.sleep(5000);
		   System.out.println("5. Which of the following is not an OOPS concept in Java?\n"+
					 "1) Polymorphism\n"+
					 "2) Inheritance\n"+
					 "3) Compilation\n"+
					 "4) Encapsulation");
           
     			 }
 				 catch(NumberFormatException | InterruptedException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      }
 		   }
       class q6 extends Thread
       {
    	   int b6=0;
    	   public void run()
      	  {
    	   for(int s=0;s<1;s++)
     	  {
     	    try
     			  {
     	    	q6.sleep(5000);
		  System.out.println ("6. Which of the following is a type of polymorphism in Java Programming?\n"+
					 "1) Multiple polymorphism\n"+
				   	 "2) Compile time polymorphism\n"+
					 "3) Multilevel polymorphism\n"+
					 "4) Execution time polymorphism");
           
     			 }
 				 catch(NumberFormatException | InterruptedException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      }
 		   }
       class q7 extends Thread
       {
    	   int b7=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
     				 q7.sleep(5000);
		  System.out.println ("7. What is the extension of compiled java classes?\n"+
					 "1) .txt\n"+
					 "2) .js\n"+
					 "3) .class\n"+
					 "4) .java");
         
     			 }
 				 catch(NumberFormatException | InterruptedException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      }
 		   }
       class q8 extends Thread
       {
    	   int b8=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
     				 q8.sleep(5000);
		  System.out.println("8. Which of these are selection statements in Java?\n"+
					 "1) break\n"+
					 "2) continue\n"+
					 "3) for()\n"+
					 "4) if()");
          
     			 }
 				 catch(NumberFormatException | InterruptedException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      }
 		   }
       class q9 extends Thread
       {
    	   int b9=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
     				 q9.sleep(5000);
		  System.out.println("9. Which of these keywords is used to define interfaces in Java?\n"+
					 "1) intf\n"+
					 "2) Intf\n"+
					 "3) interface\n"+
					 "4) Interface");
         
     			 }
 				 catch(NumberFormatException | InterruptedException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 } 
 		         }
 		      }
 		   }
       class q10 extends Thread
       {
    	   int b10=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
     				 q10.sleep(5000);
		  System.out.println("10. Which of the following is a superclass of every class in Java?\n"+
					 "1) ArrayList\n"+
					 "2) Abstract class\n"+
					 "3) Object class\n"+
					 "4) String");
     			 }
 				 catch(NumberFormatException | InterruptedException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      }
 		   }
        
public class Main5 {
    public static void main(String[] args)  throws IOException, InterruptedException,Exception   {
    	int b1=0;
    	int b2=0;
    	int b3=0;
    	int b4=0;
    	int b5=0;
    	int b6=0;
    	int b7=0;
    	int b8=0;
    	int b9=0;
    	int b10=0;
    	int score=0;
    	String a11="";
		String a22="";
		String a33="";
		String a44="";
		String a55="";
		String a66="";
		String a77="";
		String a88="";
		String a99="";
		String a100="";
		System.out.println("DO YOU WANT TO PLAY??????");
		System.out.println("press enter or type 'no'");
		InputStreamReader read = new InputStreamReader(System.in);
	    BufferedReader in=new BufferedReader(read); 
	    String answer=in.readLine();
	    if (!answer.equals("no"))
	    {
	    	System.out.println("INSTRUCTIONS:");
			System.out.println("1.YOU ARE HAVING 10 QUESTIONS\n"
					+ "2.YOU ARE ALSO GIVEN 4 OPTIONS OUT OF WHICH 1 IS CORRECT\n"
					+ "3.YOU NEED TO TYPE THE CORRECT OPTION NUMBER\n"
					+"4.YOU HAVE 5 SECONDS TIME LIMIT FOR EACH QUESTION\n"
					+ "5.YOU WILL HAVE SCORE BASED ON IT:\nCORRECT:5,WRONG:-1.NOT ATTEMPTED:0\n"
					+ "    LETS GET START!!!!!    \n");
			q1 t1=new q1();
			q2 t2=new q2();
			q3 t3=new q3();
			q4 t4=new q4();
			q5 t5=new q5();
			q6 t6=new q6();
			q7 t7=new q7();
			q8 t8=new q8();
			q9 t9=new q9();
			q10 t10=new q10();
			try (Scanner sc = new Scanner(System.in)) {
				t1.start();
				String userInput=sc.nextLine();
				int a = 0;
				if(userInput.isEmpty()) {
					a=0;
				}
					 if( a==2)
				    {
					 b1=5;
					 a11="James gosling";
				    }
				    else if(a==1)
				    {
				    	 b1=-1;
				    	 a11="Guido van Rossum";
				    }
				    else if(a==3)
				    {
				    	 b1=-1;
				    	 a11="Dennis Ritchie";
				    }
				    else if(a==4)
				    {
				    	 b1=-1;
				    	 a11="Bjarne Stroustrup";
				    }
				    else if(a==0 || a>4)
					 {
					    	 b1=0;
					    	 a11="you didn't answered";
					 }
					 try (Scanner sc1 = new Scanner(System.in)) {
							t2.start();
							String userInput2=sc1.nextLine();
							int b = 0;
							if(userInput2.isEmpty()) {
								b=0;
							}
					if(b==3)
				    {
				    	  b2=5;
				    	  a22="JDK";
				    }
				 else if(b==1)
				    {
				    	 b2=-1;
				    	 a22="JRE";
				    }
				    else if(b==2)
				    {
				    	 b2=-1;
				    	 a22="JIT";
				    }
				    else if(b==4)
				    {
				    	 b2=-1;
				    	 a22="JVM";
				    }
				    else if(b==0 || b>4)
					 {
					    	 b2=0;
					    	 a22="you didn't answered";
					 }
					try (Scanner sc3 = new Scanner(System.in)) {
							t3.start();
							String userInput3=sc3.nextLine();
							int c = 0;
							if(userInput3.isEmpty()) {
								c=0;
							}
					if(c==3)
					    {
					    	b3=5;
					    	a33="Keyword";
					    }
					 else if(c==1)
					    {
					    	 b3=-1;
					    	 a33="Identifier And Keyword";
					    }
					    else if(c==2)
					    {
					    	 b3=-1;
					    	 a33="Identifier";
					    }
					    else if(c==4)
					    {
					    	 b3=-1;
					    	 a33="none of above mentioned";
					    }
					    else if(c==0 || c>4)
						 {
						    	 b3=0;
						    	 a33="you didn't answered";
						 }
					try (Scanner sc4 = new Scanner(System.in)) {
						t4.start();
						String userInput4=sc4.nextLine();
						int d = 0;
						if(userInput4.isEmpty()) {
							d=0;
						}
				 if(d==4)
				    {
				 	b4=5;
				 	a44=".java";
				    }
				 else if(d==1)
				    {
				    	 b4=-1;
				    	 a44=".js";
				    }
				    else if(d==3)
				    {
				    	 b4=-1;
				    	 a44=".txt";
				    }
				    else if(d==2)
				    {
				    	 b4=-1;
				    	 a44=".class";
				    }
				    else if(d==0 || d>4)
					 {
					    	 b4=0;
					    	 a44="you didn't answered";
				     }
				 try (Scanner sc5 = new Scanner(System.in)) {
						t5.start();
						String userInput5=sc5.nextLine();
						int e = 0;
						if(userInput5.isEmpty()) {
							e=0;
						}
				 if(e==3)
				    {
				    b5=5;
				  a55="compilation";
				    }
				 else if(e==1)
				    {
				    	 b5=-1;
				    	 a55="Polymorphism";
				    }
				    else if(e==2)
				    {
				    	 b5=-1;
				    	 a55="Inheritance";
				    }
				    else if(e==4)
				    {
				    	 b5=-1;
				    	 a55="Encapsulation";
				    }
				    else if(e==0 || e>4)
					 {
					    	 b5=0;
					    	 a55="you didn't answered";
					 }
				 try (Scanner sc6 = new Scanner(System.in)) {
						t6.start();
						String userInput6=sc6.nextLine();
						int f = 0;
						if(userInput6.isEmpty()) {
							f=0;
						}
				 if(f==2)
				    {
				    b6=5;
				  a66="Compile time polymorphism";
				    }
				 else if(f==1)
				    {
				    	 b6=-1;
				    	 a66="Multiple polymorphism";
				    }
				    else if(f==3)
				    {
				    	 b6=-1;
				    	 a66="Multiple polymorphism";
				    }
				    else if(f==4)
				    {
				    	 b6=-1;
				    	 a66="Execution time polymorphism";
				    }
				    else if(f==0 || f>4)
					 {
					    	 b6=0;
					    	 a66="you didn't answered";
					 }
				 try (Scanner sc7 = new Scanner(System.in)) {
						t7.start();
						String userInput7=sc7.nextLine();
						int g = 0;
						if(userInput7.isEmpty()) {
							g=0;
						}
				  if(g==3)
				    {
					  b7=5;
					  a77=".class";
				    }
				  else if(g==1)
				    {
				    	 b7=-1;
				    	 a77=".txt";
				    }
				    else if(g==2)
				    {
				    	 b7=-1;
				    	 a77=".js";
				    }
				    else if(g==4)
				    {
				    	 b7=-1;
				    	 a77=".java";
				    }
				    else if(g==0 || g>4)
					 {
					    	 b7=0;
					    	 a77="you didn't answered";
					 }
				  try (Scanner sc8 = new Scanner(System.in)) {
						t8.start();
						String userInput8=sc8.nextLine();
						int h = 0;
						if(userInput8.isEmpty()) {
							h=0;
						}
				 if(h==4)
				    {
				  b8=5;
				a88="if()";
				    }
				 else if(h==1)
				    {
				    	 b8=-1;
				    	 a88="break";
				    }
				    else if(h==3)
				    {
				    	 b8=-1;
				    	 a88="for()";
				    }
				    else if(h==2)
				    {
				    	 b8=-1;
				    	 a88="continue";
				    }
				    else if(h==0 || h>4)
					 {
					    	 b8=0;
					    	 a88="you didn't answered";
					 }
				 try (Scanner sc9 = new Scanner(System.in)) {
						t9.start();
						String userInput9=sc9.nextLine();
						int i = 0;
						if(userInput9.isEmpty()) {
							i=0;
						}
				  if(i==3)
				    {
				    	 b9=5;
				    	 a99="interface";
				    }
				  else if(i==1)
				    {
				    	 b9=-1;
				    	 a99="intf";
				    }
				    else if(i==2)
				    {
				    	 b9=-1;
				    	 a99="Intf";
				    }
				    else if(i==4)
				    {
				    	 b9=-1;
				    	 a99="Interface";
				    }
				    else if(i==0 || i>4)
					 {
					    	 b9=0;
					    	 a99="you didn't answered";
					 }
				  try (Scanner sc10 = new Scanner(System.in)) {
						t10.start();
						String userInput10=sc10.nextLine();
						int j = 0;
						if(userInput10.isEmpty()) {
							j=0;
						}
				 if(j==3)
				    {
				    	b10=5;
				    	a100="Object class";
				    }
				 else if(j==1)
				    {
				    	 b10=-1;
				    	 a100="ArrayList";
				    }
				    else if(j==2)
				    {
				    	 b10=-1;
				    	 a100="Abstract class";
				    }
				    else if(j==4)
				    {
				    	 b10=-1;
				    	 a100="String";
				    }
				    else if(j==0 || j>4)
					 {
					    	 b10=0;
					    	 a100="you didn't answered";
					  }
				score =(b1+b2+b3+b4+b5+b6+b7+b8+b9+b10);
				System.out.println("score:"+score);
				System.out.println("SUMMARY:");
				if(a==2)
				{
					System.out.println("1."+a11+"\nCORRECT!!!!!-Because Java programming was developed by James Gosling at Sun Microsystems in 1995. James Gosling is well known as the father of Java\n");
				}
				else if(a!=2)
				{
					System.out.println("1."+a11+"\nINCORRECT!!!!!-Because Java programming was developed by James Gosling at Sun Microsystems in 1995. James Gosling is well known as the father of Java\n");
				}
				if(b==3)
				{
					System.out.println("2."+a22+"\nCORRECT!!!!!-Because JDK is a core component of Java Environment and provides all the tools, executables and binaries\n");
				}
				else if(b!=3) 
				{
					System.out.println("2."+a22+"\nINCORRECT!!!!!-Because JDK is a core component of Java Environment and provides all the tools, executables and binaries\n");
				}
				if(c==3)
				{
					System.out.println("3."+a33+"\nCORRECT!!!!!-Because Keywords are specially reserved words that can not be used for naming a user-defined variable, for example: class, int, for, etc\n");
				}
				else if(c!=3)
				{
					System.out.println("3."+a33+"\nINCORRECT!!!!!-Because Keywords are specially reserved words that can not be used for naming a user-defined variable, for example: class, int, for, etc\n");
				}
				if(d==4)
				{
					System.out.println("4."+a44+"\nCORRECT!!!!!-Because Java files have .java extension\n");
				}
				else if(d!=4)
				{
					System.out.println("4."+a44+"\nINCORRECT!!!!!-Because Java files have .java extension\n");
				}
				if(e==3)
				{
					System.out.println("5."+a55+"\nCORRECT!!!!!-Because There are 4 OOPS concepts in Java. Inheritance, Encapsulation, Polymorphism and Abstraction\n");
				}
				else if(e!=3)
				{
					System.out.println("5."+a55+"\nINCORRECT!!!!!-Because There are 4 OOPS concepts in Java. Inheritance, Encapsulation, Polymorphism and Abstraction\n");
				}
				if(f==2)
				{
					System.out.println("6."+a66+"\nCORRECT!!!!!-Because There are two types of polymorphism in Java. Compile time polymorphism (overloading) and runtime polymorphism (overriding)");
				}
				else if(f!=2)
				{
					System.out.println("6."+a66+"\nINCORRECT!!!!!-Because There are two types of polymorphism in Java. Compile time polymorphism (overloading) and runtime polymorphism (overriding)");
				}
				if(g==3)
				{
					System.out.println("7."+a77+"\nCORRECT!!!!!-Because The compiled java files have .class extension\n");
				}
				else if(g!=3)
				{
					System.out.println("7."+a77+"\nINCORRECT!!!!!-Because The compiled java files have .class extension\n");
				}
				if(h==4)
				{
					System.out.println("8."+a88+"\nCORRECT!!!!!-Because Continue and break are jump statements, and for is a looping statement\n");
				}
				else if(h!=4)
				{
					System.out.println("8."+a88+"\nINCORRECT!!!!!-Because Continue and break are jump statements, and for is a looping statement\n");
				}
				if(i==3)
				{
					System.out.println("9."+a99+"\nCORRECT!!!!!-Because interface keyword is used to define interfaces in Java\n");
				}
				else if(i!=3)
				{
					System.out.println("9."+a99+"\nINCORRECT!!!!!-Because interface keyword is used to define interfaces in Java\n");
				}
				if(j==3)
				{
					System.out.println("10."+a100+"\nCORRECT!!!!!-Because Object class is superclass of every class in Java\n");
				}
				else if(j!=3)
				{
					System.out.println("10."+a100+"\nINCORRECT!!!!!-Because Object class is superclass of every class in Java\n");
				}
			}
			
		}
				  }
				 }
				 }
				 }
					}
					}
					 }
			}
	    }
	    if(answer.equals("no"))
	    {
	    	System.out.println("THANK YOU!!!!!!!!");
	    }
    }
}