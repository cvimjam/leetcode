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
        Double out = 0;

        while (cinput != 0) {
            out = out * 10 + (cinput % 10);
            cinput = cinput / 10;
        }
        if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) {
            return 0;
        }

        return (Integer) Math.round(out);
    }

    public static void main(String argv[]) {

        System.out.println(ReverseInteger.reverse(2147483647));

    }

}