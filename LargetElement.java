import java.util.*;
class LargestElement{
    static int largestElement(int[] a){
        int size = a.length;
        int max = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {17,12,654,358,32,69};
        int ans = largestElement(arr);
        System.out.println(ans);

    }
}