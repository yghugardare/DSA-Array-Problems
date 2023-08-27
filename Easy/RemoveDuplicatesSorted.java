public class RemoveDuplicatesSorted{
    static int removeDuplicates(int[] nums) {
        // we will use two pointer approach
        int i = 0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        // return the number of unique elements in nums
        return i+1;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
}