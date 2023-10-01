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
    public static void main(String[] args) {
        
    }
}
