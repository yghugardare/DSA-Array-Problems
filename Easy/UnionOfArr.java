import java.util.*;
public class UnionOfArr {
    // For Sorted array
    static ArrayList<Integer>TwoPointerApproach(int[] arr1,int[] arr2,int n,int m){
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0 ,j = 0;
        while(i<n && j<m){
            if(arr1[i]<= arr2[j]){
                if(union.size() == 0 || union.get(union.size() -1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.size() == 0 || union.get(union.size() -1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        // exhaustive cases
        // when arr1 exhausts, so we add remaining values of arr2
        while(j < m){
            if(union.get(union.size() -1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        // when arr2 exhausts , so we add remaining values of arr1
        while(i < n){
            if(union.get(union.size() -1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        
        return union;
    }
    // when array is not sorted
    static ArrayList<Integer> doUnion(int[] a,int[] b,int n,int m){
        ArrayList<Integer> union = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<m;i++){
            hs.add(b[i]);
        }
        for(int el : hs){
            union.add(el);
        }

        return union;
    }
    public static void main(String[] args){
        // sorted arrays
        int[] a = {1,1,2,3,3,3,5};
        int[] b = {2,2,2,4,4,5,6,6,7};
        // ans= 1,2,3,4,5,6,7,
        ArrayList<Integer> ans = TwoPointerApproach(a, b, a.length, b.length);
        System.out.println(ans);
        // unsorted arrays
        int[] c = {89,12,34,56};
        int[] d ={87,89,56,34,42};
        // answer = 12,34,42,56,87,89
        ArrayList<Integer> answer = doUnion(c, d, c.length, d.length);
        System.out.println(answer);

        // ArrayList<Integer> ans = 
        
    }
}
