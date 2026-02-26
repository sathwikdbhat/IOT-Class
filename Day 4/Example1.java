// String is immutable - we cannot change it.
// We can just create copies - original string doesn't change it.
// The concat() method creates a new object - so the result is ignored.

public class Example1 {
    public static void main(String[] args) {
        String s="Java";
        s.concat("Programming");
        System.out.println(s);
    }
}
