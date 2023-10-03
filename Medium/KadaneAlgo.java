package Medium;
public class KadaneAlgo {
    static int Brute(int[] arr){
        int maxi = Integer.MIN_VALUE; // maximum sum
        int n =arr.length;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                // current subarray = arr[i.....j]

                //add the current element arr[j]
                // to the sum i.e. sum of arr[i...j-1]
                sum += arr[j];

                maxi = Math.max(maxi, sum); // getting the maximum
            }
        }

        return maxi;
    }
    static int Optimal(int[] nums){
        int maxS = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:nums){
            sum += num;
        maxS = sum>maxS ?sum:maxS;
        if(sum<0) sum=0;
        }
    return maxS;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int brute=Brute(arr);
        int optimal=Optimal(arr);
        System.out.println(brute+" "+optimal);
    }
}