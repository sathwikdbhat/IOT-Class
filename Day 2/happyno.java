import java.util.Scanner;
public class happyno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n!=1 && n!=4) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }

        if (n == 1 || n == 7)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
        sc.close();
    }
}



/*public class happyno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+(d*d);
            n=n/10;
        }
        if(sum==1 || sum==7)
            System.out.println(temp+" is a happy number");
        else
            System.out.println(temp+" is not a happy number");
        sc.close();
    }
}*/