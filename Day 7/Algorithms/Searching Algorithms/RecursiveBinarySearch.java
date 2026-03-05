public class RecursiveBinarySearch {
    public static int RecursiveBinarySearch(int[] arr, int key, int start, int end){
        if (start>end) return -1;
        int mid=start+(end-start)/2;
        if (arr[mid]==key) return mid;
        else if (arr[mid]<key)
            return RecursiveBinarySearch(arr, key, mid+1, end);
        else
            return RecursiveBinarySearch(arr, key, start, mid-1);
    }
    public static void main(String[] args) {
        int[] arr={2,5,8,12,16,23,38,45};
        int key=16;
        int result=RecursiveBinarySearch(arr, key,0, arr.length-1);
        System.out.println("Element: "+key+" found at index "+result);
    }
}