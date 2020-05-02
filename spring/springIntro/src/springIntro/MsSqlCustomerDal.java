package springIntro;

public class MsSqlCustomerDal implements ICustomerDal
{
	public void add() 
	{
		System.out.println("Added to MsSql Database");	
	}
}