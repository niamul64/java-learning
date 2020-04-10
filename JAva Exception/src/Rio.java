import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class Rio {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan=null;
		
		try {
			scan=new Scanner(new File("olympic.txt"));
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		while(scan.hasNextLine()) {
			String s=scan.nextLine();
			System.out.println(s);
			
		}
		
		
		
	}

}
