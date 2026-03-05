import java.util.Arrays;

public class BinarySearch {
    static int BinarySearch(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]==key){
                return mid;
            }
            else if (arr[mid]<key){
                start=mid+1;  // Go to the right side.
            }
            else {
                end=mid-1;  // Go to the left side.
            }
        }
        return -1;  // If key was not found, return an invalid index.
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,12};
        int key=6;

        // System.out.println(BinarySearch(arr, key));

        int index=BinarySearch(arr, key);
        if (index!=-1){
            System.out.println(key+" is present at index "+index+ " in the array:"+Arrays.toString(arr));
        }
        else{
            System.out.println(key+" is not present in the array "+Arrays.toString(arr));
        }
    }
}