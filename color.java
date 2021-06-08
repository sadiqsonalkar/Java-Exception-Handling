import java.util.*;
class NonrainbowColor extends Exception
{
		public NonrainbowColor(String s)
		{
			
				super(s);
		}
}
class color
{
		public static void main(String args[])
		{
			String rb[]={"violet","indigo","blue","green","yellow","orange","red"};
			List<String> list = Arrays.asList(rb);
			String c,s;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name of a color:");
			c=sc.next();
			s=c.toLowerCase();
			
			try
			{
				if (list.contains(s))
				{
					System.out.print("Colour entered is "+c+" and it is a rainbow color");
				}else
				{
					throw new NonrainbowColor("entered color is not a rainbow color");
				}
            }catch( NonrainbowColor e)
			{
				System.out.println(e.toString());
			}
		}
		
}
				
				
