package java_new;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FlieR 
{
	public void read_data_method(int a) throws IOException {
		File f=new File ("C:\\Users\\Alisha.chawla\\Desktop\\java.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		{
			String s = null;
			System.out.println("o/p is ");
			
			for (int i=0; i<3 ;i++)
			s=br.readLine();
			System.out.println(s);
		}
	
	}
public void main(String args[]) throws IOException 
{
	FlieR r= new FlieR();
	r.read_data_method(2);
	
	}  
	
}
