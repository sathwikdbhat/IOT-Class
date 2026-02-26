interface InterfaceConcepts {
    void display();
}
class A{

}
class B{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        //Old Java Code - Boring Code : BoilerPlate Code
        InterfaceConcepts obj=new InterfaceConcepts();
        public void display() {
            System.out.println("Hello");
        }
    };

    // Java 8 or 1.8, Lambda expression(->)
    InterfaceConcepts obj1=() -> System.out.println("Hello");
}