/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two
2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Problem4 {

    public static void main(String[] args){
        getLargestPalindrome();
    }

    static void getLargestPalindrome() {

        int current;
        int maxPalindrome = 0;

        for(int i=999; i>100; i--) {
            for(int j=999; j>100; j--) {
                if(isPalindrome(i*j)) {
                    current = i*j;
                    if(current>maxPalindrome) {
                        maxPalindrome = current;
                    }
                }

            }
        }

        System.out.println("The largest palindrome from 3-digit products is "+maxPalindrome);
    }

    static boolean isPalindrome(int number){
        String num = number+"";
        int length  = num.length();
        int i, begin, end, middle;

        begin  = 0;
        end    = length - 1;
        middle = (begin + end)/2;

        for (i = begin; i <= middle; i++) {
            if (num.charAt(begin) == num.charAt(end)) {
                begin++;
                end--;
            }
            else {
                break;
            }
        }
        if (i == middle + 1) {
            return true;
        }
        else {
            return false;
        }
    }

}
