 class car extends vehicle {
    void run() {
        System.out.println("car is running");
    }
    void speed(String mode) {
        System.out.println("Drive mode is " + mode);
    }
    public static void main(String[] args) {
        car c = new car();
        c.run();
        c.speed("Sport");
        c.speed();
        c.speed(250);
    }
}