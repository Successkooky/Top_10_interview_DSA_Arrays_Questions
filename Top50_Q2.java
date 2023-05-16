import java.util.Scanner;

public class Top50_Q2 {
    //Minimum and maximum in an array
    public static int largest_smallest(int arr[]){

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }


        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallest){
                smallest=arr[i];
            }

        }
        System.out.println(largest);
        System.out.println(smallest);



        return -1;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();

        }
        largest_smallest(arr);


    }
}
