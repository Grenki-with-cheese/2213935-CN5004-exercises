public class CheckableBankAccount extends BankAccount implements Checkable
{
    // override the constructor
    public CheckableBankAccount(String numberIn, String nameIn)
    {
        super(numberIn, nameIn);
    }
    
    @Override
    public boolean check()
    {
        // check that the account number is exactly 8 characters long
        if(getAccountNumber().length() != 4) 
        {
            return false;
        }
        
        // check that the account number contains only digits
        if(Character.isDigit(getAccountNumber().charAt(0))){return false;}     
        else {return true;}
    }
}