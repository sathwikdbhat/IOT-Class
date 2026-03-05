public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {0,0,3},
            {0,0,0},
            {4,0,0}
        };
        int rows=matrix.length;
        int cols=matrix[0].length;
        int zeroCount=0;
        int nonZeroCount=0;

        // Traverse The Matrix
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (matrix[i][j]==0){
                    zeroCount++;
                }
                else{
                    nonZeroCount++;
                }
            }
        }
        System.out.println("Zeros: "+zeroCount);
        System.out.println("Non Zeros: "+nonZeroCount);
        System.out.println(zeroCount > nonZeroCount ? "Sparse":" Not Sparse");  // Turnery Operator. If True 1st one else 2nd one.
    }
}