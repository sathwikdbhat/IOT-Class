public class student{
    String name;
    int age;
    student (String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name +" "+age);
    }
    public static void main(String[] args) {
        student st=new student("Before: "+"Sathwik", 20);
        st.display();

        st.name="Sat";
        st.age=21;
        System.out.println("After : "+st.name+ " "+st.age);
    }
}






/*public class student{
    String name;
    int age;
    student (String name, int aage){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name +" "+age);
    }
    public static void main(String[] args) {
        student st=new student("Sathwik", 20);
        st.display();

        st.name="Sat";
        st.age=21;
        System.out.println("After : "+st.name+ " "+st.age);
    }
}*/