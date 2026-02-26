abstract class prani {
    void eat(){
        System.out.println("Animals eat food");
    }
    // This method cannot have a body. It will be implemented in child classes
    abstract void run();
    // If an abstract class has only abstract method, it is 100% abstraction if it has even 1 normal method - it is not 100%
}
class bekku extends prani{
    @Override
    void run(){
        System.out.println("Cat run fast");
    }
}
class cheetah extends prani{
    @Override
    void run(){
        System.out.println("Cheetah runs very fast");
    }
}
class example {
    public static void main(String[] args) {
        bekku cat=new bekku();
        cheetah che=new cheetah();
        cat.eat();
        cat.run();
        che.eat();
        che.run();
    }
}