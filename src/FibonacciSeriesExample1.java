/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 2/19/2021
 *   Time: 1:58 AM
 *   File: FibonacciSeriesExample1.java
 */

public class FibonacciSeriesExample1 {
public static void main(String args[])
{
    int n1=0,n2=1,n3,i,count=10;
    System.out.println(n1+""+n2);
    for (i=2; i<count;++i) {
        n3=n1+n2;
        System.out.println(""+n3);
        n1=n2;
        n2=n3;

    }

}

}
