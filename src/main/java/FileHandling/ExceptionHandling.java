package FileHandling;

public final class ExceptionHandling {
	
	int amount=100;
	
public final void Add()
{
	System.out.println(2+3);
	amount=amount+100;
	System.out.println(amount);
}

public void div(int a, int b)
{
	try
	{
	int c=a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		int c= a-b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		System.out.println(e);
		int c= a*b;
		System.out.println(c);
	}
	finally
	{
		System.out.println("finally");
	}
}


public void FindUser(String username ,String password) throws ArithmeticException,NullPointerException
{
	
	if(username.equalsIgnoreCase("sathish")&&password.equalsIgnoreCase("test"))
	{
		System.out.println("Login sucess");
	}
	else
	{
		throw new ArithmeticException("you have entered incorrect login credentials");
		//System.out.println("test");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling E = new ExceptionHandling();
		E.div(10, 0);
		
		E.Add();
		E.FindUser("Sathish", "test");
		
		
	}

}
