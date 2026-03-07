import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht=new Hashtable<>();
        ht.put(84, "Rishab");
        ht.put(114, "Tejas");
        ht.put(91, "Sathwik");
        ht.put(100, "Shreyas");  // Does the Key%11 and store at the index refer to modulus value.
        ht.put(124, "Vivek");
        ht.put(74, "Prashanth");
        // ht.put(null,"Rahul");  // No null key is allowed, it will not show error during the compilation but the exception will appear when the program is runned.
        for (Map.Entry<Integer, String> entry: ht.entrySet()){
            System.out.println(entry.getKey()+"     "+entry.getValue());
        }
        ht.remove(74);
        System.out.println(ht);
    }
}