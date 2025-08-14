//Charlie Bazemore, CMSC 215, 20Aug23
//Program will find the first ten square numbers that are greater than Long.MAX_VALUE.

package week1;
import java.math.BigInteger;

public class Week1 {
    public static void main(String[] args) {

        // Find the number for "Max Value"
        System.out.println("The Long.MAX_VALUE is:\t" + Long.MAX_VALUE + '\n');

        // Store Number
        BigInteger num = new BigInteger("9223372036854775807");

        // Initialize variable
        BigInteger square = num.multiply(num);

        // Initialize variable
        int count = 0;

        // Create loop to print 10 numbers (Square Numbers greater than "Max Value")
        while (count < 10) {
            square = num.multiply(num); // Calculate the square
            System.out.println(square);

            //Increment the number
            num = num.add(BigInteger.ONE);

            //Increment the count
            count++;
        }
    }
}