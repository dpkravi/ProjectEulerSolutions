/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class Problem2 {

    public static void main(String[] args){
        evenFibonacci(4000000);  //Brute force. Can be made faster. Every 3rd element is a even number so the check can be removed.
    }

    static void evenFibonacci(int limit){
        double sum=0;
        int a = 0;
        int b = 1;
        int current = 0;
        while(current < limit){
            current = a+b;
            a = b;
            b = current;
            if(current%2 == 0 && current<limit){
                sum+=current;
            }
        }
        System.out.println("The sum of even fibonacci numbers is "+sum);
    }
}
