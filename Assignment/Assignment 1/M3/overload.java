public class overload {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        overload obj= new overload();
        System.out.println(obj.add(3,2));
        System.out.println(obj.add(5.5,4.5));
        System.out.println(obj.add(10,3,2));
    }
}