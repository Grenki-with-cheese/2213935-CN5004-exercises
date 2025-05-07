public class LambdaDemo
{
    public static void main(String[] args)
    {
        // create a test oblong
        Oblong testOblong = new Oblong (8,8); 
        Customer testCustomer = new Customer("s333", "John Doe", 1234567890);

        System.out.println("Customer is " + checkValidity(() ->
                              {
                                return testCustomer.getCustomerId().length()==4&&Character.isLetter(testCustomer.getCustomerId().charAt(0));
                              }
                         ));
       // this checks that the sides are greater than zero
       System.out.println("oblong is " + checkValidity(() ->
                              {
                                 return testOblong.getLength() > 0 && testOblong.getHeight() > 0;
                              }
                         ));
       
       // this checks that the length and height are not equal
       System.out.println("oblong is " + checkValidity(() ->
                               {
                                 return testOblong.getLength() != testOblong.getHeight();
                               }
                            ));
    }
    
    private static String checkValidity(Checkable objectIn)
    {
        if(objectIn.check())
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }
}
