package Recursion;

public class ParameterisedAndFunctionalRecursion {



    static void parameterisedSummationOfNTerms(int n, int sum){//parameterised way
        if(n < 1){
            System.out.println("Sum= " + sum);
            return;
        }
        parameterisedSummationOfNTerms(n-1, sum+n);

    }


    static int functionalSummationOfNTerms(int n){
        if (n == 0)
            return 0;
        return n + functionalSummationOfNTerms(n-1);
    }

    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n -1);
    }

    
    public static void main(String[] args){
        parameterisedSummationOfNTerms(3, 0);
        System.out.println("Sum = "+functionalSummationOfNTerms(3));
        System.out.println("Factorial of " + "n= "+factorial(5));
    }
}
