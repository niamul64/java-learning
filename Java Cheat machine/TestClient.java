import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;



public class TestClient {

	public static void main(String[] args) {
		System.out.print("Niamul ");
		Scanner scan =new Scanner(System.in);
		try {
			System.out.println("Hasan");
			Socket s=new Socket("192.168.22.54",8111);
			OutputStream os =s.getOutputStream();
			PrintStream p=new PrintStream(os);
			while(true)
			{
				String str=scan.nextLine();
				if(str.equals("exit"))
				{
					break;
				}
				p.println(str);
				
			}
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		scan.close();
	
		
	}

}
