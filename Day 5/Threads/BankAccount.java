public class BankAccount {
    int balance=5000;
    synchronized void withdraw(int amount){
        balance-=amount;
    }
    public static void main(String[] args) throws InterruptedException{
        BankAccount acc=new BankAccount();
        Thread t1=new Thread(() -> acc.withdraw(500));
        Thread t2=new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        //join() will make sure that the main thread waits for the child thread to complete.
        System.out.println("Final Balance: "+acc.balance);
    }
}

/*
➡️Code Explanation:-
The synchronized keyword ensures that only one thread can execute withdraw() operation at a time, preventing RACE CONDITION and ensuring correct balance deduction.

➡️Points to Remember:-
Synchronization avoids RACE CONDITION.
Locks critical section in an application.
Slower but safe.
Essential for shared resources.
*/





/*public class BankAccount1 {
    int balance=3000;
    void withdraw(int amount){
        balance-=amount;
    }
    public static void main(String[] args) throws InterruptedException{
        BankAccount1 acc=new BankAccount1();
        Thread t1=new Thread(() -> acc.withdraw(500));
        Thread t2=new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();
        System.out.println("Final Balance: "+acc.balance);
    }
}*/

/*
Both the threads t1 & t2 access and modify the same balance variable simultaneously. Due to lack of synchronization, the final balance becomes inconsistent.

➡️Points to Remember:-
Shared data causes issues.
Execution order is unpredictable.
Leads to data inconsistency.
Need synchronization to solve the RACE CONDITION.
*/