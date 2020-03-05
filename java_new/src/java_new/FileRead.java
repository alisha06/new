package java_new;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public void readfile(int n) throws IOException
	{
		File f=new File ("C:\\Users\\Alisha.chawla\\Desktop\\new.txt");
		FileReader fr= new FileReader(f);
		BufferedReader Br = new BufferedReader(fr);
			int d=0;
			String S;
			while((S=Br.readLine())!=null)
			{
				d=d+1;
			if (d==n)
			{
				System.out.println(S);
				break;
			}
			
			}
		}
		public static void main(String args[]) throws IOException 
		{
			FileRead r= new FileRead();
			r.readfile(2);
	
	}


	}
