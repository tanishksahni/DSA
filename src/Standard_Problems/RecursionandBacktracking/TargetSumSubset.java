package Standard_Problems.RecursionandBacktracking;

import java.util.ArrayList;

public class TargetSumSubset {

    public static void tss(int[] arr, int i, int target, ArrayList<Integer> ans) {
        //for all numbers positive
        if(target == 0){
            return;
        }

        if(i==arr.length) {
            if(target == 0)
                System.out.println(ans);
            return;
        }

        //select ith element
        ans.add(arr[i]);
        tss(arr, i+1, target-arr[i], ans);
        ans.remove(ans.size()-1);

        //reject ith element
        tss(arr, i+1,target,ans);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 3;
        tss(arr,0,target, new ArrayList<>());
    }
}
