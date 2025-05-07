public class TestResetable {
    public static void main(String[] args) {
        Oblong resetableOblong = new Oblong(10, 10);
        System.out.println("Oblong is "+resetableOblong.getHeight()+" "+resetableOblong.getLength());

        BankAccount resetableBankAccount = new BankAccount("S234", "John Doe");
        System.out.println("BankAccount is "+resetableBankAccount.getBalance());

        resetableBankAccount.deposit(1000);
        
        System.out.println("BankAccount is "+resetableBankAccount.getBalance());
        
        
        resetObject(()-> resetableBankAccount.withdraw(1000));

        
        resetObject(()-> {resetableOblong.setHeight(1); resetableOblong.setLength(1);});
        System.out.println("BankAccount is "+resetableBankAccount.getBalance());
        System.out.println("Oblong is "+resetableOblong.getHeight()+" "+resetableOblong.getLength());    
    }
    static void resetObject(Resetable objectIn) {
        objectIn.reset();}
}
