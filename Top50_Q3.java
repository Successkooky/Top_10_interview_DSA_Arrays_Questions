import java.util.Scanner;

public class Top50_Q3 {
    //Reverse of an array
    public static int Reverse(int arr[]){
        int start=0;
        int end=(arr.length)-1;
        while(start<=end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }


        return -1;
    }

    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();

        }
        Reverse(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");


        }
        System.out.println();


    }
}
