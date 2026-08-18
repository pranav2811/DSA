package Sorting;

public class Main{

    static void printArr(int[] arr){

        for(int i : arr){
            System.out.println(i);
        }
    }



    static int[] insertionSort(int[] arr){
        int  n = arr.length;

        for (int i = 1; i < n;i++){

            int element = arr[i];
            int j = i -1;

            while(j >= 0 && arr[j] > element){
                arr[j+1] = arr[j];
                j = j -1; 
            }

            arr[j+1] = element;
        }

        return arr;


    }




    public static void main(String[] args){


        int[] arr = {1,4,3,5,2};
        insertionSort(arr);
        printArr(arr);

    }
}