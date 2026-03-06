import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,4,5,6,6,7,8};
        System.out.println(Arrays.toString(arr));
        Set<Integer> UniqueElements=new HashSet<>();
        for (int x:arr){
            UniqueElements.add(x);
        }
        System.out.println(UniqueElements);
        
        Set<Integer> nonDuplicates=new HashSet<>();
        nonDuplicates.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5));  // addAll() --> It also removes the duplicate elements and only keeps the original elements.
        System.out.println(nonDuplicates);
    }
}
