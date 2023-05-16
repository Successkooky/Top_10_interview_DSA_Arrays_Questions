public class Top50_Q4 {

    public static int BubbleSort(int[] arr){
        for (int i = 0; i < (arr.length)-1; i++) {
            for (int j = 0; j < (arr.length) - i - 1; j++) {


                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return 0;
    }




    public static void main(String args[]){

        int arr[]={109,32,211,232,43,214};
        BubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);


        }
    }
}
