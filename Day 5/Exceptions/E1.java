public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        try {
            k=i/j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[9]);
        } 
        catch (Exception e) {
            System.out.println("\nSomething Unexpected Happened\n");
        }
        finally{
            System.out.println("End of Execution");
            System.out.println("Turn OFF DB");
            System.out.println("Turn OFF Internet");
            System.out.println("Turn OFF Files");
            System.out.println("Turn OFF Docker");
        }
        System.out.println("\nThe value of k is: "+k);
    }
    static{
        System.out.println("Start Execution");
        System.out.println("Load DB");
        System.out.println("Load Internet");
        System.out.println("Load Files");
        System.out.println("Load Docker");
    }
}










/*public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        try {
            k=i/j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[9]);
        } 
        catch (Exception e) {            // This need to be written at the end because this is used as base class as for all the type of exceptions.
            System.out.println("Something Unexpected Happened");
            e.printStackTrace(); // Details
        }
        System.out.println("The value of k is: "+k);
    }
}*/





/*public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        try {
            k=i/j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[9]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
            e.printStackTrace(); // Details
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
            e.printStackTrace();
        }
        System.out.println("The value of k is: "+k);
    }
}*/






/*public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try {
            k=i/j;
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
            e.printStackTrace(); // Details
        }
        System.out.println("The value of k is: "+k);
    }
}*/






/*public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        k=i/j;
        System.out.println("The value of k is: "+k);
    }
}*/






/*public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=5;
        k=i/j;
        System.out.println("The value of k is: "+k);
    }
}*/