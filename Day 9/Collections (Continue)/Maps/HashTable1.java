import java.util.Hashtable;
public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(84, "Rishab");
        ht.put(114, "Tejas");
        ht.put(91, "Sathwik");
        ht.put(100, "Shreyas");
        ht.put(124, "Vivek");
        
        System.out.println(ht.getOrDefault(100,"Not Found"));
        System.out.println(ht.getOrDefault(120,"Not FOund"));
        ht.putIfAbsent(104, "Rahul");
        System.out.println("Updated Table: "+ht);  // This will be added
        ht.putIfAbsent(99, "Abhi");
        System.out.println("Updated Table: "+ht); // This won't added
 
    }
}