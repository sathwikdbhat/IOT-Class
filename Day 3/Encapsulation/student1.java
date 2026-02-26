public class student1 {
    private String name;
    private int age;
    student1 (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        student1 s1 = new student1("Tejas", 21);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        s1.setName("Sathwik");
        s1.setAge(20);
        System.out.println("Updated Name: " + s1.getName());
        System.out.println("Updated Age: " + s1.getAge());
    }
}