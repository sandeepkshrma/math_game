import java.util.*;
import java.io.*;
public class Test3Enhance {
	
	public static void main(String args[])
   {
		Random Rnumber = new Random();
		int rightcount = 0,wrongcount = 0,tatalcount =100;
		int CalNumber =0;
		
		System.out.println("Its a calculation game of 100 Questions - Give atleast 70 correct answer's and win Rs.500");
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=100;i++)
		{
			int number1 = Rnumber.nextInt(100);
			int number2 = Rnumber.nextInt(10);
			
			
			int opt = Rnumber.nextInt(4);
			switch(opt)
			{
			case 0:
				CalNumber = number1 * number2;
				System.out.print( i+ ". Calculate " + number1 + " * " + number2 + " = ");
				break;
			case 1:
				CalNumber = number1 + number2;
				System.out.print( i+ ". Calculate " + number1 + " + " + number2 + " = ");
				break;
			case 2:
				CalNumber = number1 - number2;
				System.out.print( i+ ". Calculate " + number1 + " - " + number2 + " = ");
				break;
			case 3:
				if(number2 == 0)
				{
				  CalNumber = 0;
				  System.out.print( i+ ". Calculate " + number1 + " / " + number2 + " = ");
				}
				else
				{
				CalNumber = number1/number2;
				System.out.print( i+ ". Calculate " + number1 + " / " + number2 + " = ");
				}
				
				break;
			}
			 while(!sc.hasNextInt()) 
		     {
		      System.out.println("Please Enter an Integer");
			  sc.next();
		     }
		   
			 int RecNumber = sc.nextInt();

			    if(RecNumber == CalNumber)
				{
					rightcount++;
					System.out.println("Congratulations Right Answer, Total Right Answer are"+rightcount);
	                System.out.println();			
				}else
				{
					wrongcount++;
					System.out.println("Wrong Answer ..!! Please Try Again, Total Wrong Answer are "+wrongcount);
					System.out.println();
				}

			
		}
		   
		   		
		    System.out.println("                                            G A M E   O V E R");
			System.out.println("Total Correct:-"+rightcount);
			System.out.println("Total incorrect:-"+wrongcount);
			if(rightcount >=75)
			{
				System.out.println("                                  Congratulations you win Rs. 500");
			}
			else
			{
				System.out.println("                                   Sorry!!! you lose the Game.");
			}
   
   }
}