package Standard_Problems.Arrays;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args){
        int arr[] = {7, -6, 3, 8, -1, 8, -11};
        int target = 0;
        solution(arr, target, arr.length);
    }

    public static void solution(int[] a, int target, int n) {
        // first we will sort the array
        Arrays.sort(a);
        for (int i =0; i< n; i++) {
            if(i==0 || a[i] != a[i-1]) {
                int j = i+1;
                int k = n-1;
                int tar = target - a[i];
                while(j < k){
                    if(a[j] + a[k] == tar) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        //ignoring duplicate
                        while(j <k && a[j] == a[j+1]) j++;
                        while(j <k && a[k] == a[k-1]) k--;
                        j++;
                        k--;
                    } else if (a[j] + a[k] < tar) {
                        j++;
                    } else{
                        k--;
                    }
                }
            }
        }
    }
}
