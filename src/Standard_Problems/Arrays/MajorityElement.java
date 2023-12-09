package Standard_Problems.Arrays;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int result = findMajorityElement(arr,n);
        System.out.println(result);
    }

    public static int findMajorityElement(int[] arr, int n) {
        int candidate = arr[0];
        int count = 1;

        for(int i =1 ; i< n; i++) {
            if(arr[i] == candidate){
                count ++;
            } else {
                count --;
            }
            if( count == 0){
                candidate = arr[i];
                count = 1;
            }
        }
        // verify if candidate is your answer
        count =0;
        for(int value : arr){
            if(value == candidate) {
                count++;
            }
        }
        if (count > n/2) {
            return candidate;
        } else
            return -1;

    }
}
