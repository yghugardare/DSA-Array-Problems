import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfArr {
    static ArrayList<Integer> whenSorted(int[] a,int[] b,int n,int m){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0,j = 0;
        while(i<n && j<m){
            // case 1
            if(a[i] < b[j]){
                i++;
            }
            else if(a[i] >  b[j]){
                j++;
            }
            else{
                if(ans.size() == 0 || ans.get(ans.size()-1) != b[j])
                ans.add(a[i]);
                i++;
                j++;
            }
        }

        return ans;
    }
    static ArrayList<Integer>whenUnSorted(int[] a,int[] b,int n,int m){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer>HS =  new HashSet<>();
        // int max = n > m ? n : m;
        // int[] arr = max == n?a : b; 
        for(int i = 0;i<n;i++){
            HS.add(a[i]);
        }
        for(int i = 0;i<m;i++){
            if(HS.contains(b[i])){
                ans.add(b[i]);
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,4};
        int[] b= {2,3,3,4,5,5};
        // 2,3,4
        ArrayList<Integer> result = whenSorted(a, b, a.length, b.length);
        // System.out.println(result);
        int[] a1 = {1, 2, 3,3, 4, 5, 6};
        int[] b1 = {7,6,5,4,3};
        // 3,4,5,6
        ArrayList<Integer> result1 = whenUnSorted(a1, b1, a1.length, b1.length);
        System.out.println(result1);
    }
}
