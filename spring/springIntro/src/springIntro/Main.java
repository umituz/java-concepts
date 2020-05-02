package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = (ICustomerService) context.getBean("service",ICustomerService.class);
		customerService.add();
		// CustomerManager customerManager = new CustomerManager((ICustomerDal) context.getBean("database",ICustomerDal.class));
		//customerManager.add();
	}
}