import java.util.ArrayList;
import java.util.List;
public class WildCard {
    public static void printList(List<?> List) {  // <?> --> It is a Generic data types. It is used exclusively within generics to represent an unknown type. It can handle anything.
        for (Object o:List){
            System.out.print(o+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        printList(strings);
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printList(integers);
    }
}