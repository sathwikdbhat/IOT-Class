public class TurnOffRSB {
    public static void main(String[] args) {
        int n=12;
        int result=n & (n-1);
        System.out.println("Result: "+result);

        // Find the binary digits of n
        String binaryN = Integer.toBinaryString(n);
        System.out.println("Binary of n: " + binaryN);
        
        // Find the binary digits of the result
        String binaryResult = Integer.toBinaryString(result);
        System.out.println("Binary of result: " + binaryResult);
    }
}