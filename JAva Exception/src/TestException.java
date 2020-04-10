import java.io.IOException;
import java.security.InvalidParameterException;



public class TestException {

	public static void main(String[] args) {

		try {

			throwException(5);
		}
		catch(Exception e)
		{


			String x=e.getMessage();
		System.out.println(x);
		}


		try {
			throwException(-5);
		}
		catch(Exception e)
		{
			String x=e.getMessage();
		System.out.println(x);
		}
	}

	public static void throwException(int n) throws InvalidParameterException,IOException{
		if(n<=0) {
			throw new InvalidParameterException("Parameter must be greater than 0.");
		}
		if(n>100) {
			throw new InvalidParameterException("Parameter must be smaller than 100.");
		}
		System.out.println(n*n);

	}
}
