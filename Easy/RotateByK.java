import java.util.Arrays;

public class RotateByK {
    static void reverse(int[] arr, int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
    static void OptimalRightRotateByK(int[] nums,int k){
        int n = nums.length;
        if(k%n == 0) return;
        if(k>n){
            k=k%n;
        }
        // last ke k places reverse kro
        reverse(nums,n-k,n-1);
        // bache hue
        reverse(nums,0,n-k-1);
        // pure array ko reverse
        reverse(nums,0,n-1);
    }
    static void OptimalLeftRotateByK(int[] arr, int k){
        int n = arr.length;
        if(k%n== 0) return;
        if(k > n){
            k = k %n ;
        } 
        // reverse kro 0,k => 0 and k-1
        reverse(arr,0, k-1);
        // reverse kro k se n-1 tak
        reverse(arr, k, n-1);
        // pure array ko reverse
        reverse(arr,0,n-1);

    }
    static void RightRotateByK(int[] arr, int k){
        int n= arr.length;
        if(k%n == 0) return;
        if(k>n){
            k = k %n;
        }
        // temparray
        int[] temp  = new int[k];
        int j = 0;
        for(int i=n-k;i<n;i++){
            temp[j] = arr[i];
            j++;
        }
        // between swaps
        for(int i =n-k-1;i>=0;i--){
            arr[i+k] = arr[i];
        }
        // temp swap with arr
        for(int i =0;i<k;i++){
            arr[i] = temp[i];
        }
    }
    static void LeftRotateByK(int[] arr, int k){
        int[] temp = new int[k];
        int n = arr.length;
        if(k%n== 0) return;
        if(k > n){
            k = k %n ;
        }
        // store in temp
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        // swap in between
        for(int i = k;i<n;i++){
            arr[i-k] = arr[i];
        }
        // add temp values to arr
        int j = 0;
        for(int i =n-k;i<n;i++){
            arr[i] = temp[j];
            j++;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1,2,3,4,5};
        // 3,4,5,1,2
        LeftRotateByK(arr, 2);
        OptimalLeftRotateByK(arr1, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
