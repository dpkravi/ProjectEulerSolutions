/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Problem5 {

    public static void main(String[] args){
        getLargestDivisible(20);
    }

    static void getLargestDivisible(int k){
        int i;
        int num=0;
        for(i=1;;i++){
            for(int j=1;j<k+1;j++){
                if(i%j==0&&j!=k){
                    continue;
                }
                else if(i%j==0&&j==k){
                    num=i;
                    break;
                }
                else{
                    break;
                }
            }
            if(num==i){
                break;
            }
        }

        System.out.println(num);

    }
}

