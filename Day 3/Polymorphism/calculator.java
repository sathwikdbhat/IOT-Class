public class calculator{
    static void calci(int a, int b){
        System.out.println(a+b);
    }
    static void calci(double a, double b){
        System.out.println(a*b);
    }
    static int calci(int a, int b, int c){
        return (a+b)*c;
    }
    public static void main(String[] args) {
        calci(5, 10);
        calci(5.5, 10.5);
        System.out.println(calci(5, 10, 2));
    }
}