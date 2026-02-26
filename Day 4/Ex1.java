public class Ex1 {
    {
        System.out.println("IIB-2");
    }
    // if we don't initialize a final variable, where is it intialized? = That is in the constructor

    final int x;
    // if we don't initialize a static final variable, where is it intialized? = That is in the constructor

    static final int y;

    Ex1(){
        x=200;
    }

    public static void main(String[] args) {
        new Ex1();  // Object is must for "IIB" output.
        
    }
    static{
        y=10;
        System.out.println("Start");
        System.out.println("DB-Start");
        System.out.println("Internet-Start");
        System.out.println("Load Files");
    }
    {
        System.out.println("IIB-1");
    }
}