import java.util.ArrayList;

public class TwoSum {
    static ArrayList<Integer>Brute(int[] a,int k){
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;i++){
                if(a[i]==a[j]) continue;
                if(a[i]+a[j]==k){
                    ans.add(i)
                }
            }
        }
        return ans;
    }
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                ans[0] = hm.get(target-nums[i]);
                ans[1] = i;
            }
            
            hm.put(nums[i],i);

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        
    }
}
