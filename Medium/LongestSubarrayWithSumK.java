package Medium;
import java.util.HashMap;

public class LongestSubarrayWithSumK {
    static int BruteForce(int[] arr,long k){
        int n = arr.length;
        int len = 0;
        for(int i=0;i<n;i++){
            long sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum == k){
                    // length
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    static int Better(int[] A,long K){
        HashMap<Long,Integer>hm = new HashMap<Long,Integer>();
        long sum = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            sum +=A[i];
            if(sum == K){
                maxLen = Math.max(maxLen,i+1);
            }
            if(hm.containsKey((sum-K))){
                int len = i-hm.get(sum-K);
                maxLen = Math.max(len,maxLen);
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        if(maxLen ==Integer.MIN_VALUE) return 0;
        return maxLen;
    }
    static int TwoPointer(int[] a,int k){
        int left=0,right =0,maxLen =0;
        int sum = a[0];
        while(right<a.length){
            while(left<=right && sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<a.length) sum+=a[right];
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = {10, 5, 2, 7, 1, 9};
        long k = 15;
        int bruteSol= BruteForce(a, k);
        int betterSol=Better(a,k);
        int twoPtrSol =TwoPointer(a,15);
        System.out.println(bruteSol+" "+betterSol+" "+twoPtrSol);

    }     
}