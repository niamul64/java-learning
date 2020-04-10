import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {

	public static void main(String[] args) {
		PrintStream print=null;
		BankAccount []per=new BankAccount[3];
		per[0]=new BankAccount("Niamul","26",100.0);
		per[1]=new BankAccount("Hasan","27",12.0);
		per[2]=new BankAccount("Ripon","28",10.0);
		try {
			print=new PrintStream(new File("output.txt"));
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		int i;
		for(i=0;i<3;i++)
		print.println(per[i]);
		print.close();
	
	}

}
