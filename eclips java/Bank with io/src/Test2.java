import java.io.File;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan=null;
	try {
		scan=new Scanner(new File("output.txt"));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	BankAccount []per=new BankAccount[3];
	int i;
	for(i=0;i<3;i++)
	{
		String s=scan.nextLine();
		String [] x=s.split(",");
		double ba=Double.parseDouble(x[2]);
		per[i]=new BankAccount(x[0], x[1],ba);
	}
	for(i=0;i<3;i++)
	{
		System.out.println(per[i]);
	}
	
	}
	

}
