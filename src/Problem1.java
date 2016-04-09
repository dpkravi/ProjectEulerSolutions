
// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
// Find the sum of all the multiples of 3 or 5 below 1000.

public class Problem1 {
    public static void main(String[] args){
 //       findSum(1000);   //Brute force
        findSumFast(1000);   //More efficient
    }

    static void findSum(int limit){
        int sum = 0;
        int i=0;
        while(i<limit){
            if(i%3 == 0 || i%5 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("The sum of all the multiples of 3 or 5 below "+limit+" is "+sum);
    }

    static void findSumFast(int limit){
        System.out.print("The sum of all the multiples of 3 or 5 below "+limit+" is ");
        System.out.println(sumDivisibleBy(3, limit)+sumDivisibleBy(5, limit)-sumDivisibleBy(15, limit));
    }

    static int sumDivisibleBy(int n, int limit){
        int m = (limit-1)/n;
        return n*(m*(m+1)/2);

    }
}
