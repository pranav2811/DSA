package Recursion;

public class FunctionalRecursion {

   static void reverseArray(int []arr, int l, int r){//using two pointers

    if(l>=r)
        return;
    int temp = arr[l];
    arr[l]=arr[r];
    arr[r] = temp;
    reverseArray(arr, l+1, r-1);

   }


   static void reverseArray1(int[] arr, int l){//using a single pointer


        int r = arr.length - 1 -l;
        if(l >=r)
            return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray1(arr,l+1);

   }    


   static boolean isStringPalindrome(String str,int l){


    int r = str.length()-l-1;
    if(l>=r)
        return true;
    if(str.charAt(l) == str.charAt(r)){
        return isStringPalindrome(str, l+1);
        
    }

    return false;


   }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        reverseArray(arr, 0, arr.length-1);
        for(int x : arr){
            System.out.println(x);
        }
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        reverseArray1(arr1, 0);

        for(int x : arr1){
            System.out.println(x);
        }

        System.out.println("Is MADAM a palindrome " + (isStringPalindrome("MADAM", 0) ? "yes" : "no"));
        
    }
}
