import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n=sc.nextInt();
        if ((n & (n-1))==0) {
            System.out.println(n+" is Power of 2");
        }
        else{
            System.out.println(n+" is Not Power of 2");
        }
    }
}