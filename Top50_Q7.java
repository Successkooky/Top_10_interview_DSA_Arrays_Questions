import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Top50_Q7 {

//    public static int zero_one_two(int arr[],int key){
//        int count=0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i]==key){
//                count++;
//            }
//
//        }
//        return count;
//    }
//
//
//    public static void main(String args[]){
//        //Count the zeros ones and twos
//        Scanner input=new Scanner(System.in);
//        int arr[]={0,1,2,1,1,2,1,1,1,2,2,2,0,0,0,1};
//        Arrays.sort(arr);
//        for (int i = 0; i < args.length; i++) {
//            System.out.print(arr[i]);
//
//        }
//        System.out.println();
//        int key=input.nextInt();
//        System.out.println(zero_one_two(arr,key));
//
//
//    }


    //Logic2
    public static void Sort012(int arr[]){
        int lo=0;
        int hi= arr.length-1;
        int mid=0,temp=0;

        while(mid<=hi){
            switch(arr[mid]){
                case 0:{
                    temp=arr[lo];
                    arr[lo]=arr[mid];
                    arr[mid]=temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }

                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[hi];
                    arr[hi]=temp;
                    hi--;
                    break;
                }

            }
        }

    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }







    public static void main(String args[]){
        int arr[]={0,1,1,0,1,2,1,2,0,0,0,1};
        Sort012(arr);
        printArray(arr);

    }
}
