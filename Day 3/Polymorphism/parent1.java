public class parent1 {
    void show(){
        System.out.println("Parent static method");
    }
}
class children extends parent1{
    @Override
    void show(){
        System.out.println("Child static method");
    }
    public static void main(String[] args) {
        parent1 p = new children();
        p.show();
    }
} 