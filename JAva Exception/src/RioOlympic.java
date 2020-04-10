import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RioOlympic {

	public static void main(String[] args) {
	Scanner scan=null;
		
		try {
			scan=new Scanner(new File("olympic.txt"));
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		while(scan.hasNextLine()) {
			String s=scan.nextLine();
			System.out.print(s);
			String [] x=s.split(" ");
			int total=Integer.parseInt(x[1])+Integer.parseInt(x[2])+Integer.parseInt(x[3]);
			System.out.println(" "+total);
		}
		
		
		
		
		
	

	}

}
