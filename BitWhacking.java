/******************************************************************************
 *  Compilation:  javac BitWhacking.java
 *  Execution:    java BitWhacking a b
 *  
 *  Reads in two command-line arguments a and b, applies Java's
 *  bit-whacking operations and prints the results.
 * 
 *  % java BitWhacking 43 3
 *  ~43        = -44
 *   43 &    3 = 3
 *   43 |    3 = 43
 *   43 ^    3 = 40
 *   43 >>   3 = 5
 *  -43 >>   3 = -6
 *   43 >>>  3 = 5
 *  -43 >>>  3 = 536870906
 *   43 /  2^3 = 5
 *  -43 /  2^3 = -5
 *
 * % java BitWhacking 43 17
 *  ~43        = -44
 *   43 &    17 = 1
 *   43 |    17 = 59
 *   43 ^    17 = 58
 *   43 >>   17 = 0
 *  -43 >>   17 = -1
 *   43 >>>  17 = 0
 *  -43 >>>  17 = 32767
 *   43 /  2^17 = 0
 *  -43 /  2^17 = 0
 *
 ******************************************************************************/

public class BitWhacking { 

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a < 0 || b < 0) throw new RuntimeException("Inputs must be nonnegative");

        System.out.println("~" + a + "        = " + (~a));
        System.out.println(" " + a + " &    " + b + " = " + (a & b));
        System.out.println(" " + a + " |    " + b + " = " + (a | b));
        System.out.println(" " + a + " ^    " + b + " = " + (a ^ b));

        System.out.println(" " + a + " >>   " + b + " = " + (a >> b));
        System.out.println(" " + a + " <<   " + b + " = " + (a << b));
        System.out.println("-" + a + " >>   " + b + " = " + (-a >> b));
        System.out.println(" " + a + " >>>  " + b + " = " + (a >>> b));
        System.out.println("-" + a + " >>>  " + b + " = " + (-a >>> b));
        System.out.println(" " + a + " /  2^" + b + " = " + (a / (1 << b)));
        System.out.println("-" + a + " /  2^" + b + " = " + (-a / (1 << b)));
    }
}