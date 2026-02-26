public class StringPool {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        System.out.println(s1==s2);     // Checks Values

        String s3=new String("Java");
        System.out.println(s1==s3);    // Checks References / Objects
        System.out.println(s1.equals(s3));    // Checks Values
    }
}




/* s1 & s2 share same object in POOl
   new String() creates new heap object
   == compares references
   .equals() compares values */