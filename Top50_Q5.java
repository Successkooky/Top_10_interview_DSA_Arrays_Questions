import java.util.Arrays;

public class Top50_Q5 {

    public static int Smallest_Largest(Integer[] arr, int k){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        return arr[k-1];
    }

    public static void main(String args[]){
        Integer arr[]=new Integer[] {12,32,2,23,4,15};
        int k=3;
        System.out.println(Smallest_Largest(arr,k));

    }
}
