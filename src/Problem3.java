/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

public class Problem3 {

    public static void main(String[] args){
        primeFactor(600851475143.0);
    }

    static void primeFactor(double prime){
        int largestFactor;
        //2 is the only even prime, so if we treat 2 separately we can increase factor with 2 every step
        if( prime % 2 == 0){
            prime = prime/2;
            largestFactor = 2;
            while(prime % 2 == 0){
                prime = prime / 2;
            }
        }
        else largestFactor = 1;
        int factor = 3;
        while(prime>1){
            if(prime%factor == 0){
                prime = prime/factor;
                largestFactor = factor;
                while(prime % factor == 0){
                    prime = prime / factor;
                }
            }
            factor += 2;
        }
        System.out.println("The largest prime factor is "+largestFactor);
    }
}

