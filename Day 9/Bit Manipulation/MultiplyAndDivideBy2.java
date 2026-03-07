public class MultiplyAndDivideBy2 {
    public static void main(String[] args) {
        int n=5;     //0101<<1 = 1010
        int result = n<<1;   //Multiply be two
        System.out.println("Result: "+result);
        int x=40;
        int res = x>>1;  //Divide by two
        System.out.println("Result: "+res);
    }
}