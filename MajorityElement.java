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
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int N = arr.length;
        int brute = Brute(arr, N);
        System.err.println(brute);
    }
}
