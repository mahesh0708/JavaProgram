
public class ThrowKeyword {
	public static void check() throws ArithmeticException
	{
		try
		{
		int a =50;
		int b = a/10;
		System.out.println("B value is " +b);
		
	    }catch(ArithmeticException e)
		{
		System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		check();

	}

}
