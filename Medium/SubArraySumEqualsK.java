import java.util.HashMap;

public class SubArraySumEqualsK {
    static int better(int arr[], int k) {
        int n = arr.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            int sum = 0;
            for (int j = i; j < n; j++) { // ending index j
                // calculate the sum of subarray [i...j]
                // sum of [i..j-1] + arr[j]
                sum += arr[j];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm= new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        // intially add 0 with count as 1
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            // if hashmap has x-k
            // then increase the count
            if(hm.containsKey(prefixSum-k)){
                count+=hm.get(prefixSum-k);
            }
            // else just put the prefix sum
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }


        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int ans = subarraySum(arr,k);
        System.out.println(ans);
    }
}
