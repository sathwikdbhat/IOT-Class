import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            int multi=num*i;
            System.out.println(num+ " x "+ i + " = "+ multi);
        }
        sc.close();
    }
}