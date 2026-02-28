class Student {
    String name;
    int USN;
}
class Intern{
    String name;
    int id;
    Intern(String name, int id){
        this.name=name;
        this.id=id;
    }
}

// Array of Objects {Student Objects}
public class A7{
    public static void main(String[] args){
        Student[] stud=new Student[3];
        stud[0]=new Student();
        stud[0].name="Sathwik";
        stud[0].USN=91;
        System.out.println(stud[0].name+"  "+stud[0].USN);

        // The datatype is the class itself
        Intern[] itn=new Intern[]{
            new Intern("Tejas", 114),
            new Intern("Gowda", 100),
            new Intern("Babu", 124)
        };
        for (Intern i:itn){
            System.out.println(i.name+"  "+i.id);
        }
        for (Student s:stud){
            System.out.println(s.name+"  "+s.USN);
        }
    }
}