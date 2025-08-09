package SeleniumProject;

public class Encapusulation {
	
	private Double balance=1000.23;
	
	public Double getBalacne(int pin)
	{
		if(pin==4567)
		{
			System.out.println("valid pin entered..");
			return balance;
		}
		else
		{
			System.out.println("Invalid pin entered..");
			return 0.0;
		}	
	}
		
		public void setBalance(double deposit)
		{
			System.out.println(balance=balance+deposit);
			System.out.println("Hi Good Morning");
			
			
		}
	}

	
