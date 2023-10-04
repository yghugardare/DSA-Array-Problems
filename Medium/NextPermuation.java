import java.util.Arrays;

public class NextPermuation {
    static void reverseArr(int[] arr,int start,int end){
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void nextPermutation(int[] nums) {
        // Find the longest prefix match
        int idx = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        // edge case , when nums is 
        // [1,2,3,4,5] or
        // [5,4,3,2,1]
        // if(idx ==-1){
        //     reverseArr(nums,0,nums.length-1);
        //     // return nums;
        // }
        // But this case not needed when we are not returning anything
        // as at the end , the array is being reversed
        if(idx != -1){
        // Find the closest one greater than i
        // swapt it with i and i+1
            for(int i=nums.length-1;i>idx;i--){
                if(nums[i]>nums[idx]){
                    // swap them
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break;
                }
            }
        }
        // sort them
        // array is in descending order bcoz of previous swap
        // simply reverse it from idx+1 to n-1
        reverseArr(nums,idx+1,nums.length-1);
        // return nums;


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
