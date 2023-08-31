import java.util.HashMap;
import java.util.Map;
public class FindSingle {
    static int Brute(int[] a){
        // select the num
        for(int num:a){
            // initialize a counter
            int cnt = 0;
            // linear search
            for(int el :a){
                if(num == el){
                    cnt++;
                }
            }
            // check for cnt
            if(cnt == 1) return num;
        }
        return -1;
    }
    static int Better1(int[] a){
        // find max el in arr
        int max = Integer.MIN_VALUE;
        for(int num : a){
            if(num > max){
                max = num;
            }
        }
        // decalare a hash array of size max +1
        int[] hash =  new int[max+1];
        //increase the value of hash key according to count
        for(int i =0;i<a.length;i++){
            hash[a[i]]++;
        }
        // now the elem which has value of hash key == 1 , that is answer
        for(int i =0;i<a.length;i++){
            if(hash[a[i]] == 1){
                return a[i];
            }
        }
        
        return -1;
    }
    static int Better2(int[] a){
        // declare a hashmap
        HashMap<Integer,Integer>hm = new HashMap<>();
        // iterate a , to add values
        for(int i=0;i<a.length;i++){
            // retrieve the value for the key and if the key not present
            // set it by default 0
            int value = hm.getOrDefault(a[i], 0);
            // update/insert new value , value is acting as count
            // key is the array element
            hm.put(a[i],value+1);
        }
        // iterate over hashmap and check which key has value 1
        for(Map.Entry<Integer,Integer>it : hm.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }
        return -1;
    }
    // this will only work when the other element repeat in multiples of 2
    static int singleNumber(int[] nums) {
        int x = 0;
        for(int i=0;i<nums.length;i++){
            x = x ^ nums[i];
        }
        return x;
    }
    public static void main(String[] args){
        int[] a = {3,3,1,2,2,1,4};
        int brute = Brute(a);
        int better1 = Better1(a);
        int better2 = Better2(a);
        int optimal = singleNumber(a);
        System.out.println(brute+" "+better1+" "+better2+" "+optimal);

    }
}
