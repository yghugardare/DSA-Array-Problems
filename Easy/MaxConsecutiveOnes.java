public class MaxConsecutiveOnes {
    static int findMaxConsecutiveOnes(int[] nums) {
        int max_c = 0,cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                cnt++;
            }else{
                cnt = 0;
            }
            max_c = Math.max(max_c,cnt);    
        }
        return max_c;
    }
    public static void main(String[] args){
        int[] a = {1,1,1,1,0,0,0,1,1,0,1,1,1,1,1,1,1,1,1,1};
        int ans = findMaxConsecutiveOnes(a);
        System.out.println(ans);

    } 
}
