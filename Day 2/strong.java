import java.util.Scanner;
public class strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==num){
            System.out.println(num+" is a strong number.");
        }
        else{
            System.out.println(num+" is not a strong number.");
        }
        sc.close();
    }
}



/*public class strong{
    int factorial(int d){
        int fact=1;
        for(int i=1;i<=d;i++){
            fact*=i;
        }
        return fact;
    }
    boolean isstrong(int n){
    int temp=n;
    int sum=0;
    while(n>0){
        int d=n%10;
        sum=sum+factorial(d);
        n=n/10;
    }
    if(sum==temp)
        return true;
    else
        return false;
}
public static void main(String[] args) {
    strong st=new strong();
    if(st.isstrong(145)){
        System.out.println("145 is a strong number");
    }
    else
        System.out.println("145 is not a strong number");
}
}*/