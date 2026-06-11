
package Basics;

import java.util.ArrayList;
import java.util.List;

public class BasicMath{

    static int numberOfDigits(int n){
        int counter = 0;

        while(n > 0){
            n /=10;
            counter++;
        }
        return counter;
    }

    static int reverseNumber(int n){

        int newNum = 0;
        while(n > 0){
            int lastDigit = n %10;
            n /=10;
            newNum = (newNum*10)+lastDigit;
        }

        return newNum;
    }

    static boolean isPalindrome(int n){

        int reversed = reverseNumber(n);

        if(n == reversed)
            return true;
        return false;

    }
    static int gcd(int x, int y){

        /*brute force approach - iterate from to the minimum of the two numbers and update the gcd 

        int min = Math.min(x, y);
        int gcd = 1;

        for(int i =1; i <= min;i++){
            if(x%i == 0 && y %i ==0){
                gcd = i;
            }
        }

        return gcd; */

        /* better approach - instead of iterating from 1 to min, iterate reverse from min to 1; the first possible case will be the gcd 
        
        int min = Math.min(x, y);


        for(int i =min; i > 0;i--){
            if(x%i == 0 && y %i ==0){
                return i;
            }
        }

        return 0;
        */

        /* Optimal Approach: The Euclidean Algorithm is a method for finding the greatest common divisor (GCD)
        of two numbers. It operates on the principle that the GCD of two numbers remains
        the same even if the smaller number is subtracted from the larger number.

        To find the GCD of n1 and n2 where n1 > n2:
        1. Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
        2. Once one becomes 0, the other is the GCD of the original numbers.\


        Example:
        n1 = 20, n2 = 15

        gcd(20, 15) = gcd(20 - 15, 15) = gcd(5, 15)
        gcd(5, 15)  = gcd(15 - 5, 5)  = gcd(10, 5)
        gcd(10, 5)  = gcd(10 - 5, 5) = gcd(5, 5)
        gcd(5, 5)   = gcd(5 - 5, 5)  = gcd(0, 5)

        Hence, return 5 as the GCD.
         */


        while( x > 0 && y > 0){

            if(y > x){
                y = y %x;
            }else{
                x = x %y;
            }  

        }

        if(x == 0){
            return y;
        }

        return y;
    
    }

        static boolean isArmstrongNumber(int n){
            //a number whose sum of each digit raised to the power of the numebr is digits is equal to the numebr itself

            int numDigits = numberOfDigits(n);
            int lastDigit = 0;
            int sum = 0;
            int temp = n;
            while(temp > 0){
                lastDigit =temp %10;
                sum += (int)Math.pow(lastDigit, numDigits);
                temp /=10;
            }

            if(sum == n){
                return true;
            }

            return false;
        }


        static void printDivisors(int n){
            
            List<Integer> divList = new ArrayList<>();
            
            /*brute force approach is to iterate from 1 to the number

            for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    divList.add(i);
                }
            }*/

                //optimal approach: work on symetry upto the square root for example if 4 is a diviosr of 12 then 12/4 is also a divisor


            for(int i = 1; i <= Math.sqrt(n);i++){
                if(n % i ==0){
                    divList.add(i);

                    if(n / i != i)
                        divList.add(n/i);
                }
                
            }

            for(int divNums : divList){
                System.out.println(divNums);
            }
        }

        static boolean checkPrime(int n){
            int counter = 0;

            for(int i = 1; i <= Math.sqrt(n);i++){
                if(n % i == 0){
                    counter+=1;

                    if(i!=n/i){
                        counter+=1;
                    }
                }

            }
            System.out.println("The number of factors = "+counter);

            if(counter ==2){
                return true;
            }
            return false;
        }

    
    public static void main(String[] args){
        
        System.out.println("No of digits = "+numberOfDigits(123456789));
        System.out.println("Reverse of " + 123456789 + " = "+reverseNumber(123456789));
        System.out.println("Is 1551 a palindrome: " + isPalindrome(1551));
        System.out.println("Gcd of 8 and 12 is " + gcd(12, 8));
        System.out.println("is 9474 an armstrong number: " + isArmstrongNumber(9474));
        System.out.println("The divisors of 48 are : \n");
        printDivisors(48);
        System.out.println("Is 48 a prime number: " + checkPrime(48));
        System.out.println("Is 7 a prime number: " + checkPrime(7));
        



    }
}