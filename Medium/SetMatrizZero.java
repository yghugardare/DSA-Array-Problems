import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrizZero{
    static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
        // set all non-zero elements as -1 in the row i:
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        // set all non-zero elements as -1 in the col j:
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> brute(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // Set -1 for rows and cols that contains 0. Don't mark any 0 as -1:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }
        // Finally, mark all -1 as 0:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
    static void better(int[][] matrix) {
        //row col of matrix
        int rows = matrix.length;
        int cols= matrix[0].length;
        // take to arrays as markings
        int[] row = new int[rows];
        int[] col =  new int[cols];
        //mark row and col array to 1 if 0
        // present in matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        // the marked row and col 
        // must be set to 0
        // in matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    static void setZeroes(int[][] matrix) {
        boolean fr = false,fc = false;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
            }}
        }
        if(fr) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if(fc) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};

        setZeroes(arr);
        
        // ArrayList<ArrayList<Integer>>matrix = new ArrayList<>();
        // matrix.add(new ArrayList<>(Arrays.asList(0,1,2,0)));
        // matrix.add(new ArrayList<>(Arrays.asList(3,4,5,2)));
        // matrix.add(new ArrayList<>(Arrays.asList(1,3,1,5)));
        // int n = matrix.size();
        // int m = matrix.get(0).size();

        // ArrayList<ArrayList<Integer>> ans = brute(matrix, n, m);

        // System.out.println("The Final matrix is: ");
        // for (ArrayList<Integer> row : ans) {
        //     for (Integer ele : row) {
        //         System.out.print(ele + " ");
        //     }
        //     System.out.println();
        // }
}
}