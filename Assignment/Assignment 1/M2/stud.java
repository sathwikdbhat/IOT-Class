public class stud {
    stud(){
        String name="Sathwik";
        int age=20;
        System.out.println("Name: "+name+", Age: "+age);
    }
    stud(String name, int age){
        String n=name;
        int a=age;
        System.out.println("Name: "+n+", Age: "+a);
    }
    public static void main(String[] args) {
        stud sd=new stud();
        stud sd1=new stud("Tejas", 21);
    }
}