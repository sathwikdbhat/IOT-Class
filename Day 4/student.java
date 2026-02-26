interface sports{
    void play();
}
class person{
    String name;
    person(String name){
        this.name=name;
    }
}
public class student extends person implements sports{
    student(String name){
        super(name);
    }
    @Override
    public void play(){
        System.out.println(name+" plays football");
    }
}
class demo2{
    public static void main(String[] args) {
        
        student s=new student("Sathwik");
        s.play();
    }
}