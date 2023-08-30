public class MissingNumber {
    static int Brute(int[] a){
        int n = a.length+1;
        for(int i=1;i<=n;i++){
            int flag = 0;
            for(int j=0;j<a.length;j++){
                if(a[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }      
        }
        return -1;
    }
    static int Better(int[] a){
        int n = a.length;
        int[] hash = new int[n+1];
    
        for(int i =0;i<n-1;i++){
            // setting number in a as hash's index
            hash[a[i]] = 1;
        }
        for(int i=1;i<hash.length;i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return -1;
    }
    static int Sum(int[] a){
        int N = a.length+1;
        int sum = (N * (N + 1)) / 2;
        int s2 = 0;
        for(int x : a){
            s2 += x;
        }
        return (sum-s2);
    }
    static int XOR(int[] arr){
        int x1 = 0,x2 = 1;
        for(int i=1;i<arr.length+1;i++){
            x1 = x1 ^ arr[i-1]; 
            x2 = x2 ^ (i+1);  // 1 to N
        }
        
        return (x1^x2);
    }
    // this is for 0 toN
    static int LeetCode(int[] nums) {
        int xor1 = 0,xor2 = 0;
        int N = nums.length + 1;
        for(int i = 0 ; i < N-1;i++){
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i+1); //0 toN
        }
        return (xor1 ^xor2);
    }

    public static void main(String[] args){
        int[] arr = {5,1,2,3,6};
        int brute = Brute(arr);
        int better = Better(arr);
        int sum = Sum(arr);
        int xor = XOR(arr);
        System.out.println(brute+" "+better+" "+sum+" "+xor);
    }
}