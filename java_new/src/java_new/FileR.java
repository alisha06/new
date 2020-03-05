package java_new;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileR {
	public void readfile(int a, int b) throws IOException
	{
		File f=new File ("C:\\Users\\Alisha.chawla\\Desktop\\new.txt");
		FileReader fr= new FileReader(f);
		BufferedReader Br = new BufferedReader(fr);
		int d=0;
		String S;
		while((S=Br.readLine())!=null)
		{
			d=d+1;
		if (d>=a && d<=b)
		{
			System.out.println(S);
		}
		
		}
	}

	public static void main(String args[]) throws IOException 
	{
		FileR read= new FileR();
		read.readfile(1,2);
		


}


}
