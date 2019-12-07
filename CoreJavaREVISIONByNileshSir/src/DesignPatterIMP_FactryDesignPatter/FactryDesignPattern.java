package DesignPatterIMP_FactryDesignPatter;

public class FactryDesignPattern {

	
	public static Currency  getCurrency(String country)
	{
		
		if(country.equals("India"))
		{
			return new Rupees();
		}
		else if(country.equals("USA"))
		{
		return new Dollar();

		}
		else
		return null;
		
	}
}
  // As par user requirement runtime object change (use) in the Application 
