import java.util.*;
public class LongestConsecutiveSequence {
    static void Sort(int[] arr,int n){
        for (int i = 0; i <= n - 1; i++) {
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
    }}
    static int Brute(int[] arr,int n){
    ArrayList<Integer>ans = new ArrayList<>();
    // sort
    Sort(arr,n);

    for(int i=0;i<n-1;i++){
        if(arr[i+1] != arr[i]+1){
            ans.clear();
            continue;
        }
        else{
            ans.add(arr[i]);
        }
    }


    return ans.size();

    }
    public static void main(String[] args) {
        int[] arr ={100,4,200,1,3,2};
        int ans = Brute(arr, arr.length);
        System.out.println(ans);
    }
}
