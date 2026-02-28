public class BankAccount1{
    private double balance=10000;
    //Member class
    class Transaction{
        void withdraw(double amount){
            if(amount<=balance){
                balance-=amount;
                System.out.println("Withdraw: "+amount);
            }
            else{
                System.out.println("Insufficient Funds");
            }
        }
    }
    public static void main(String[] args) {
        BankAccount1 account=new BankAccount1();
        // Outer.Inner in_object=out_object.new Inner(); ❌
        BankAccount1.Transaction tx=account.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println(account.balance);
    }
}

/*
➡️Points to Remember:-
Transaction belongs to specify account.
Direct access to private variable balance.
Clean Encapsulation.
*/