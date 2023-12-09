package Standard_Problems.Sorting;

public class Sort012 {

    public static void main(String[] args) {
        int[] arr = {1, 2,0,1,0,0,0,1,2,2,0,1,0,1,0};
        sort012(arr);
        for(int value: arr){
            System.out.print(value+ " ");
        }
    }

    public static void sort01(int[] arr){
        int i=0;
        int j=0;
        int k =arr.length-1;
        while (i< arr.length){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                i++;
            }
        }
    }
    public static void sort012(int[] arr){
        int i=0;
        int j=0;
        int k =arr.length-1;
        while (i <= k){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
                //we cannot do i++ as we are not sure what's coming from thr rhs
            }
        }
    }
}