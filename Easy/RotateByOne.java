import java.util.Arrays;

public class RotateByOne {
    static void LeftRotate(int[] arr,int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    static void RightRotate(int[] arr,int n){
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr2 = {1,2,3,4,5,6,7,8};
        LeftRotate(arr, arr.length);
        RightRotate(arr2, arr2.length);
        // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
    
}