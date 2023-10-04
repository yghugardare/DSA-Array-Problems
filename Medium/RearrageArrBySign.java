import java.util.ArrayList;
import java.util.Arrays;

public class RearrageArrBySign {
    static int[] Brute(int[] nums) {
        ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();
        for(int num:nums){
            if(num<0){
                neg.add(num);
            }
            else{
                pos.add(num);
            }             
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i] = pos.get(i);
            nums[2*i+1] = neg.get(i);
        }
    return nums;
    }
    static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();
        for(int num:nums){
            if(num<0){
                neg.add(num);
            }
            else{
                pos.add(num);
            }             
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i] = pos.get(i);
            nums[2*i+1] = neg.get(i);
        }
    return nums;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] brute = Brute(arr);
        System.out.println(Arrays.toString(brute));
        int[] better = rearrangeArray(arr);
        System.out.println(Arrays.toString(better));
    }
}