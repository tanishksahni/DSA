package Standard_Problems.Sorting;

public class MergeTwoSortedArray {
    public static void main (String[] args) {
        int[] arr1 = {2, 3, 8, 10, 12, 15};
        int[] arr2 = {3, 5, 7, 11};
        int[] ans = compute(arr1,arr2);
        for(int val: ans){
            System.out.print(val + " ");
        }
    }

    public static int[] compute (int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i=0 , j =0;
        int k = 0;
        while (i < arr1.length && j< arr2.length) {
            if(arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while( i< arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j< arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
    }
}
