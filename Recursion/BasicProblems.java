package Recursion;

public class BasicProblems {

    static void printName(int n){

        if(n == 0){
            return;
        }
        System.out.println("Pranav");
        n--;
        printName(n);

    }

    static void printLinearlyToN(int i, int n){
        if(i > n)
            return;
        System.out.println(i);
        printLinearlyToN(i+1,n);

    }

    static void printLinearlyReverse(int i, int n){
        if(i>n)
            return;
        System.out.println("n="+n);

        printLinearlyReverse(i,n-1);
    }

    static void printLinearlyToNUsingBacktracking(int i, int n){
        if(i < 1)
            return;
        printLinearlyToNUsingBacktracking(i-1,n);
        System.out.println(i);
    //last element is executed first (backtracking)
    }


    public static void main(String[] args){

        printName(5);
        printLinearlyToN(1,10); 
        printLinearlyReverse(1,10);
        printLinearlyToNUsingBacktracking(10,10);
    }
}
