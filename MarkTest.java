import java.util.*;

class InvalidAgeException extends Exception
{
  public InvalidAgeException()
  {
    super();
  }
}
class Test
{
public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age::");
    int Age = sc.nextInt();
    try
    {
      if ((Age < 0) || (Age > 100))
      {
        throw new InvalidAgeException();
      }
      

      System.out.println("Valid Input");

    }
    catch (InvalidAgeException e)
    {
      System.out.println("Invalid Input");
    }
  }
}