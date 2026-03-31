public class insertionsort {
    public static void B(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > curr){
                arr[j + 1] = arr[j]; // shift right
                j--;
            }

            arr[j + 1] = curr; // insert at correct position
        }

        // print sorted array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {7,4,0,2,1};
        B(arr);
    }
}