import java.util.*;
class NonSaarcCountry extends Exception
{
		public NonSaarcCountry (String s)
		{
			
				super(s);
		}
}
class saarc_country
{
		public static void main(String args[])
		{
			String rb[]={"Afghanistan","Bangladesh","Bhutan","India","Maldives","Nepal","Pakistan","Sri Lanka"};
			List<String> list = Arrays.asList(rb);
			String c,s;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name of a country:");
			c=sc.next();
			s=c.toLowerCase();	
			try
			{
				if (list.contains(s))
				{
					System.out.println("country entered is a Saarc country");
				}else
				{
					throw new NonSaarcCountry ("entered country is not a Non-Saarc country");
				}
            }
			catch( NonSaarcCountry e)
			{
				System.out.println(e.toString());
			}
		}
}
				
				
