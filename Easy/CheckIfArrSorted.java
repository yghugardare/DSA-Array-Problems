public class CheckIfArrSorted {
    static boolean isSorted(int[] arr){
        int size = arr.length - 1;
        //traverse
        for(int i=0;i<size;i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {21,43,42,54,67};
        int[] b = {21,42,43,54,68};
        boolean a1= isSorted(a);
        boolean a2= isSorted(b);
        System.out.println(a1+"  "+ a2);
    }
}
