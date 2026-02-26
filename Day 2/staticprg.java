public class staticprg{
    static int count=0;
    int id;
    staticprg(){
        count++;
        id=count;
        System.out.println("Object ID: " + id);
    }
    public static void main(String[] args) {
        staticprg s1=new staticprg();
        staticprg s2=new staticprg();
        staticprg s3=new staticprg();
        System.out.println("Total Objects created: " + count);
    }
}









/*public class staticprg {
    static String college="Sapthagiri college of engineering";
    String name;
    public static void main(String[] args) {
        staticprg s=new staticprg();
        s.name="Sathwik";
        System.out.println(s.name);
        System.out.println(college);
    }
}*/