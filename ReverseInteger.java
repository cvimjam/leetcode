/* Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows. 
*/

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;



public class ReverseInteger {

    public static int reverse(int input) {

        int cinput = input;
        Double out = new Double(0);

        while (cinput != 0) {
            out = out * 10 + (cinput % 10);
            cinput = cinput / 10;
        }
        if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) Math.round(out);
    }
    
    public static int reverseWithoutLong(int x) {
        int prevRev = 0 , rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            if((rev - x % 10) / 10 != prevRev){
                return 0;
            }
            prevRev = rev;
            x= x/10;
        }
        return rev;
    }

    public static void main(String argv[]) {

        for (String var : argv) {
            System.out.println(ReverseInteger.reverseWithoutLong(new Integer(var)));    
        }
        

    }

}