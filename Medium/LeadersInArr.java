import java.util.ArrayList;

public class LeadersInArr {
    static ArrayList<Integer>Brute(int[] arr){
        ArrayList<Integer>ans = new ArrayList<>(0); 
        for(int i=0;i<arr.length-1;i++){
            int flag =0;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]<arr[i+1]){
                    flag = -1;
                    break;
                }
            }
            if(flag==0) ans.add(arr[i]);
        }
        ans.add(arr[arr.length-1]);
        return ans;
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Integer>ans1 =new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        for(int i=ans.size()-1;i>=0;i--){
            ans1.add(ans.get(i));
        }
        return ans1;
    }
    public static void main(String[] args) {
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Integer>a=new ArrayList<>();
        int[] arr = {16,19,4,5,2,3,1};
        ans =Brute(arr);
        System.out.println(ans);
        a = leaders(arr, arr.length);
        System.out.println(a);
    }
}
