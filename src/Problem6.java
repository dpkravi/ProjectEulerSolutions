/*
The sum of the squares of the first ten natural numbers is,
        12 + 22 + ... + 102 = 385

        The square of the sum of the first ten natural numbers is,
        (1 + 2 + ... + 10)2 = 552 = 3025

        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class Problem6 {
    public static void main(String[] args){

        squareDifference(100);
    }

    static void squareDifference(int n){
        //Sum of first 100 numbers
        int a = (n*(n+1))/2;
        double squareA = Math.pow(a,2);

        //Sum of first 100 squares using square pyramidal numbers : https://en.wikipedia.org/wiki/Square_pyramidal_number
        double squareB = (2*Math.pow(n,3) + 3*Math.pow(n,2) + n)/6;

        double difference = squareA - squareB;

        System.out.println("DIfference of sum of squares and square of sums of first "+n+" integers is "+difference);

    }
}
