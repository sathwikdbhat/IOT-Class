import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        if (n==0){
            System.out.println("Number of digits="+1);
        }
        else{
            while(n>0){
            n=n/10;
            count++;
            sc.close();
            }
            System.out.println("The number of digits is:"+count);
        }
    }
}