public interface Payment {
    void pay();
}
class PaymentDemo{
    public static void main(String[] args) {
        // Boilerplate Code
        Payment p=new Payment() {
            
            public void pay(){
                System.out.println("Payment done using Credit Card");
            }
        };
        p.pay();

        // SCALA - Java 8
        Payment p1=() -> System.out.println("Cash Payment");
        p1.pay();
    }
}

/*
➡️Points to Remember:-
One-Time implementation.
No need to create separate class.
It is used in events & callback functions.
*/