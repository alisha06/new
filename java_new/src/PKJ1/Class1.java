package PKJ1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Class1 {
	public void readline(int line) throws BiffException, IOException
	{
		File f=new File ("C:\\Users\\Alisha.chawla\\Desktop\\data.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		int k=0;
		for (int i=0; i<r; i++)
		{
			k++;
			if (k==line)
			{
			for (int j=0; j<c;j++)
			{
				Cell c1=ws.getCell(j,i);
				System.out.println(c1.getContents());
		}
		
			}
		}
		
	}
public static void main(String args[]) throws BiffException, IOException
{
	Class1 obj=new Class1();
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	obj.readline(n);
	}


}
