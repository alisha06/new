package java_new;
import java.util.Scanner;
public class fact 
	{
		public void factorial (int a)
		{
			int num=1;
			
			for (int i =a ; i>=1 ; i-- )
			{
			 num=num*i;
			}
				System.out.println("factorial is "+num);
			
			
		}
		public static void main(String[] args) 
		{
		fact ob=new fact();
		Scanner s= new Scanner (System.in);
		System.out.println("Enter value of a=");
		int a=s.nextInt();
		ob.factorial(a);
		}
	}

