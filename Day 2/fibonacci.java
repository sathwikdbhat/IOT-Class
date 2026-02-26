public class fibonacci {
    void fib(int n) {
        int a=0, b=1, sum=0;
        System.out.print("Fibonacci Series: ");
        for(int i=0; i<n; i++) {
            System.out.print(a+" ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {
         fibonacci f = new fibonacci();
         f.fib(10);
    }
}







/*public class fibonacci {
    public static void main(String[] args) {
        int n=10, a=0, b=1, sum=0;
        System.out.print("Fibonacci Series: ");
        for(int i=0; i<n; i++) {
            System.out.print(a+" ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}*/







/*public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}*/