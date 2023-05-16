public class Top50_Q1 {
    //Find the peak element in an array

    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                 largest=arr[i];

            }



        }
        System.out.println(largest);
        return -1;


    }




    public static void main(String args[]){
        int arr[]={30,22,13,56,12,76,43,89,54};
        largest(arr);
    }
}
