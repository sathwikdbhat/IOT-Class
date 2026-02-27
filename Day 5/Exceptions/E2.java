public class E2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try {
            k=i/j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[9]);
        } 
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // we can write multiple Exception in one Catch Block using " | " instead of using multiple catch Blocks.
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}