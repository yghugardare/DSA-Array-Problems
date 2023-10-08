import java.util.Arrays;

public class RotateImage {
    static int[][] brute(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
    }
    static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void rotate(int[][] matrix) {
        // take the transpose of matrix
        int rows=matrix.length;
        for(int i=0;i<rows-1;i++){
            for(int j=i+1;j<rows;j++){
                // swap
                int temp = matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        // reverse the rows
        for(int[] arr :matrix){
            reverseArr(arr);
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        // int[][] ans =  brute(arr);
        rotate(arr);
        for(int[] num:arr){
            System.out.println(Arrays.toString(num));
        }
    }   
    
}
