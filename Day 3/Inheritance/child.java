public class child extends parent{
    child(){
        super();
        System.out.println("child constructor");
    }
    public static void main(String[] args) {
        child c = new child();
    }
}










/*public class child extends parent {
    int x=20;
    void show(){
        super.print(); // Calling the parent class method
        System.out.println(x);
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}*/