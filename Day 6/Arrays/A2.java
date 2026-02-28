public class A2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=40;
        System.out.println(arr[1]);

        /*
        Access & Upadte elements in an array --> TC0(1)
        This is because of index-based access or directed index-mapping.
        [idx=pos-1] or [pos=idx+1].
        arr.length is a property.
        string.length() is a method.
        */

        for (int i=0;i<arr.length;i++){ // Regular for loop
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        for (int x:arr){
            System.out.println(x+" ");
        }
        System.out.println();
        for (Object o:arr){ // for each loop
            System.out.println(o+" ");
        }
        System.out.println();
        String name="Java";
        System.out.println(name.length()); // length() method

        /*
        ➡️Memory Management
        Array object is stored in the Heap.
        Variable reference is stored in the stack.
        Elements are stored in contiguous memory blocks.
        char[1][1][1][1]  int[4][4][4][4]  double[8][8][8][8] bytes
        */
    }
}