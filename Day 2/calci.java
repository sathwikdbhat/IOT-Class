public class calci {
    int add(int a, int b){
        return(a+b);
    }
    public static void main(String[] args){
        calci obj = new calci();
        System.out.println("Sum: "+obj.add(5,15));
    }
}