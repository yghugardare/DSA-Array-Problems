package Medium;
import java.util.HashMap;
public class MajorityElement {
    static int Brute(int[] arr,int N){
        int count = 0;
        for(int i =0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>N/2){
                return arr[i];
            }
        }
        return -1;
    }
    static int Better(int[] arr,int N){
        HashMap<Integer,Integer>hm = new HashMap<>();
        // insert element with count
        for(int i=0;i<N;i++){
            int val = hm.getOrDefault(arr[i],0);
            hm.put(arr[i],val+1);
        }
        // check which element having frequency greater than N/2
        for(int key:hm.keySet()){
            if(hm.get(key) >N/2) return key;
        }

        
        return -1;
    }
    static int majorityElement(int[] nums) {
        int count = 0;
         int candidate = 0;
         
         for (int num : nums) {
             if (count == 0) {
                 candidate = num;
             }
             
             if (num == candidate) {
                 count++;
             } else {
                 count--;
             }
         }
         
         return candidate;
     }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int N = arr.length;
        int brute = Brute(arr, N);
        int better = Better(arr, N);
        int optimal = majorityElement(arr);
        System.out.println(brute+" "+better+" "+optimal);
    }
}
