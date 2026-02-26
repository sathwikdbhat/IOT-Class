public interface animl{
    // Interface methods are completely abstract and cannot have a body. They are implemented in the respective child classes. Therefore, interfaces exhibit 100% abstraction.
    void sound();
    void run();
}
class cat implements animl{
    @Override
    public void sound(){
        System.out.println("Cat Meow");
    }
    @Override
    public void run(){
        System.out.println("Cat runs fast");
    }
}

class dog implements animl{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
    @Override
    public void run(){
        System.out.println("Dog runs faster");
    }
}

class demo{
    public static void main(String[] args) {
        cat c=new cat();
        dog d=new dog();
        c.run();
        c.sound();
        d.run();
        d.sound();
    }
}