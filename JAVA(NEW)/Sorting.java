import java.util.*;
public class Sorting {
 public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
 }

    public static void main(String[] args){
    int arr[]={7,8,3,2,1};
    // Bubble Sort-------TC=O(n^2)
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    print(arr);

 System.out.println();
    //Selection Sort-------TC: O(n^2)
    for(int i=0;i<arr.length-1;i++){
        int smallest=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }
            int tempo=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=tempo;
        }
    }
    print(arr);

    System.out.println();

    //Insertion Sort--- TC:O(n^2)
    for(int i=1;i<arr.length;i++){
       int current=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]> current ){
            arr[j+1]=arr[j];
            j--;
        }
        //placement or condition disatisfied
        arr[j+1]=current;
    } 
    print(arr);

    }}



