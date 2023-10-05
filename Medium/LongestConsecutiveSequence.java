import java.util.*;
public class LongestConsecutiveSequence {
    static int Brute(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int largestNum = nums[0];
        int cnt =1;
        int maxCount = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==largestNum){
                cnt+=1;
                largestNum = nums[i];
            }
            else if(nums[i] != largestNum){
                cnt =1;
                largestNum = nums[i];
            }
            maxCount = Math.max(maxCount,cnt);
        }
        return maxCount;
    }
    static int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer>hs = new HashSet<>();
        // add elemens of nums to the hashet
        // O(N)
        for(int num:nums){
            hs.add(num);
        }
        // check the consecutive sequence
        int maxCount = 1;
        
        for(int num:hs){
            int count =1;
            if(!hs.contains(num-1)){
                
                int x = num;
                while(hs.contains(x+1)){
                    x = x+1;
                    count++;
                }
                
            }
        maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr ={100,4,200,1,3,2};
        int ans = Brute(arr);
        int ans1 = longestConsecutive(arr);
        System.out.println(ans+" "+ans1);
    }
}
