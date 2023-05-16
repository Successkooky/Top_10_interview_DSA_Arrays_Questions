import java.util.Arrays;
import java.util.Scanner;

public class Top50_Q6 {

    public static int frequency(int arr[],int key){

        int frq_count=0;
        for (int i = 0; i < (arr.length)-1; i++) {

            if(arr[i]==key){
                frq_count++;


            }

        }
        return frq_count;
    }


    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();


        }
        Arrays.sort(arr);
        int key=input.nextInt();
        System.out.println(frequency(arr,key));

    }
}
