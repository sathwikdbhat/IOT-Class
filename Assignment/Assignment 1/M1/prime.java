import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        boolean isPrime=true;
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println("The Number is Prime");
        }
        else {
            System.out.println("The Number is not Prime");
        }
        sc.close();
    }
}