import java.util.ArrayList;
import java.util.Iterator;
public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
    list.add(2);
    list.add(12);
    list.add(22);
    list.add(32);
    list.add(5);
    list.add(6);
    list.add(21);
    Iterator<Integer> it=list.iterator();
    // Removes the elements which are greater than 10.
    while (it.hasNext()){
        Integer i=it.next();
        if (i>10){  // Here conditions are passed.
            it.remove();
            }
        }
        System.out.println(list);
    }
}