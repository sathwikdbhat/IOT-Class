import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        // To maintain the insertion order, we use LinkedHashMap().
        Map<String, String> hashmap=new LinkedHashMap<>();
        hashmap.put("02","yyyy");
        hashmap.put("01","aaaa");
        hashmap.put("04","zzzz");
        hashmap.put("03","bbbb");
        for (Map.Entry<String, String> entry:hashmap.entrySet()){
            System.out.println(entry.getKey()+"     "+entry.getValue());
        }
    }
}






/*import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        // The values can be duplicates, but the keys should be unique.
        Map<String, String> hashmap=new HashMap<>();
        hashmap.put("02","yyyy");
        hashmap.put("01","aaaa");
        hashmap.put("04","zzzz");
        hashmap.put("03","bbbb");
        for (Map.Entry<String, String> entry:hashmap.entrySet()){
            System.out.println(entry.getKey()+"     "+entry.getValue());
        }
    }
}*/