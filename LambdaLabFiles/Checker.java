public class Checker
{
  public static void main(String[] args)
  {
    // create two oblongs
    CheckableOblong oblong1 = new CheckableOblong(10, 8); // valid
    CheckableOblong oblong2 = new CheckableOblong(0, 8); // invalid: first argument is zero
		
    // create three bank accounts
    CheckableBankAccount acc1 = new CheckableBankAccount("2213", "Ahmad"); // invalid cause first character is a digit
    CheckableBankAccount acc2 = new CheckableBankAccount("S123", "Patel"); // valid                                                                               // must contain digits only
    CheckableBankAccount acc3 = new CheckableBankAccount("a9567", "Adewale"); // should be invalid bc over 4 charactersi
    CheckableBankAccount acc4 = new CheckableBankAccount("e23", "Romulus"); // should be invalid bc only 3 characters                                                               

    // send objects to the checkValidity method 
    System.out.println("oblong1 is " + checkValidity(oblong1));
    System.out.println("oblong2 is " + checkValidity(oblong2));
             
    System.out.println("account 1 is " + checkValidity(acc1));
    System.out.println("account 2 is " + checkValidity(acc2));
    System.out.println("account 3 is " + checkValidity(acc3));
    System.out.println("account 4 is " + checkValidity(acc4));
  }

  private static String checkValidity(Checkable objectIn) // receives any Checkable object
  {
    if(objectIn.check())  // call the check method
    {
	return "valid";
    }
    else
    {
       return "invalid";			
    }
  }	
}

