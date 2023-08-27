public class SecondLargestElement {
    static int secondLargestElement(int[] a){
        int max = Integer.MIN_VALUE;
        int sMax = max +1; 
        // find max
        for(int num : a){
            if(num > max){
                max = num;
            }
        }
        // find sMax
        for(int num:a){
            if(num >  sMax && num< max){
                sMax=num;
            }
        }
        return sMax;

    }
    public static void main(String[] args) {
        int[] arr = {17,12,654,358,32,69};
        int ans = secondLargestElement(arr);
        System.out.println(ans);
    }
}
