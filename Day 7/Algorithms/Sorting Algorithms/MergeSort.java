import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        int n1=mid-start+1;
        int n2=end-mid;
        // Temporary Array
        int[] l=new int[n1];
        int[] r=new int[n2];
        // Copy the data to the Temporary array
        for (int i=0;i<n1;i++){
            l[i]=arr[start+i];
        }
        for (int j=0;j<n2;j++){
            r[j]=arr[mid+1+j];
        }
        // Initial indexes of first and second subarray.
        int i=0,j=0;
        // Initial index of the merge subarray.
        int k=start;
        while (i<n1 && j<n2){
            if (l[i]<=r[j]){
                arr[k++]=l[i++];
            }
            else {
                arr[k++]=r[j++];
            }
        }
        // Copy remaining elements from l[] if any.
        while (i<n1){
            arr[k++]=l[i++];
        }
        // Copy remaining elements from r[] if any
        while (j<n2){
            arr[k++]=r[j++];
        }
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if (start<end){
            // Find the Middle part.
            int mid=start+(end-start)/2;
            // Start first and second halves.
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            // Merge the sorted halves into one.
            merge(arr,start,mid,end);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,2,4,1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}