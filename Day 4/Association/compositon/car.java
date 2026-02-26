class Engine {
    void start(){
        System.out.println("Engine Starts");
    }
}
public class car {
    private Engine engine;
    car(){
        engine=new Engine();
    }
    void drive(){
        engine.start();
        System.out.println("Car is moving");
    }
    public static void main(String[] args) {
        car c=new car();
        c.drive();
    }
}