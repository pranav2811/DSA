package Hashing;

import java.util.*;

public class hashing{


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length;i++){
            System.out.println("Enter the value of the "+i+"th index");
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is ");

        for(int j : arr){
            System.out.println(j);
        }

        int[] hashArr = new int[10];

        for(int i = 0; i < arr.length;i++){
            hashArr[arr[i]]++;
        }

        for(int i = 0; i < hashArr.length;i++ ){
            System.out.println("The frequency of "+i+" is "+hashArr[i]);
        }


        ///for charcter
        System.out.println("Enter a string");
        String str = sc.next();
        int[] hashCharArr = new int[26];

        for(int i = 0 ; i < str.length();i++){
            hashCharArr[str.charAt(i) - 'a']++;
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {

    int index = ch - 'a'; 
    System.out.println("Occurrence of " + ch + ": " + hashCharArr[index]);
}

    //use map to overcom ethe size limiattiaon of array

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length;i++){
            
            map.putIfAbsent(arr[i], 0);

            map.put(arr[i], map.get(arr[i])+1);
        }
        int highestOccuring  = 0;
        int index = 0;
        // map.forEach((key,value)->{
    
        //     System.out.println("oCCURENCE OF "+key +" = "+ value);
        // });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int key = entry.getKey();
    int value = entry.getValue();

    if (value > highestOccuring) {
        highestOccuring = value;
        index = key;
    }
    System.out.println("OCCURRENCE OF " + key + " = " + value);
    sc.close();
}

        

    }
    }
