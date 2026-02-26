public class vehicle {
    void speed() {
        System.out.println("Vehicle is moving");
    }
    void speed(int maxSpeed) {
        System.out.println("Vehicle speed is " + maxSpeed);
    }
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.speed();
        v.speed(120);
    }
}