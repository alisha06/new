package java_new;

import java.util.Scanner;

public class armstrong {  
		 public static void main(String args[]){  
		  int r,sum=0,temp,n;   
		  Scanner s= new Scanner (System.in);
		  n= s.nextInt();
		  //int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=sum +r*r*r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("armstrong number");    
		  else    
		   System.out.println("not armstrong");    
		} 

}
