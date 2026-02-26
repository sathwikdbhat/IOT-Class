public class StringUseCase {
    public static void main(String[] args) {
        String msg="Order Confirmed";
        msg=msg+" -ID: 101";
        System.out.println(msg);

        /*msg=msg+" -ID: 102";
        System.out.println(msg);*/
    }
}



// String is immutable.
// Stored in SCP (String Constant Pool).
// Every modification creates a new Object.
// Good for read-only data.