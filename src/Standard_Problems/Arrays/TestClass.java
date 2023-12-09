package Standard_Problems.Arrays;

import java.util.*;

class TestClass {

    public static int compute(int[] arr, int n, int k){
        Arrays.sort(arr);
        int maxsum = arr[n-1];
        int i =n-2;
        k--;
        while ( k >= 0 && i >= 0){
            if(arr[i+1] == arr[i]){
                maxsum += arr[i];
            }
            else {
                k--;
                if(k == -1){
                    break;
                } else {
                    maxsum += arr[i];
                }
            }
            i--;
        }
//        HashSet<Integer> distinctNumbers = new HashSet<>();
//
//        long sum = 0;
//        for (int i = n - 1; i >= 0; i--) {
//            if (distinctNumbers.size() < k || distinctNumbers.contains(arr[i])) {
//                sum += arr[i];
//                distinctNumbers.add(arr[i]);
//            }
//        }
        return maxsum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] =new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int result = compute(arr,n, k);
            System.out.println(result);
        }



    }
}
