package Sorting;

import java.util.ArrayList;

public class Main{

    static void printArr(int[] arr){

        for(int i : arr){
            System.out.println(i);
        }
    }



    static void insertionSort(int[] arr){//time complexity is O(n^2 - average and worst casae - best case is O(n))
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

    }


    static int[] mergeSort(int[] arr, int p, int q){

        if(p>=q) return arr;

        int mid = (p+q)/2;
        mergeSort(arr,p,mid);
        mergeSort(arr,mid+1,q);
        return merge(arr, p, mid, q);
    }


    static int[] merge(int[] arr, int p, int mid, int r){

        ArrayList<Integer> mergedList = new ArrayList<>();
        int left = p;
        int right = mid + 1;


        while(left <= mid && right <= r){
            if(arr[left] <=arr[right]){
                mergedList.add(arr[left]);
                left++;
            }
            else{
                mergedList.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            mergedList.add(arr[left]);
            left++;
        }
        while(right <= r){
            mergedList.add(arr[right]);
            right++;
        }

        for(int i = p; i <= r; i++){
            arr[i] = mergedList.get(i-p);
        }

        return arr;
    }  



    public static void main(String[] args){


        int[] arr = {1,4,3,5,2};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);

        int[] arr1 = {23,14,22,53,34};
        insertionSort(arr1);
        printArr(arr1);

    }
}