// Exercise 1
// 1. Ask the user for 5 numbers
// 2. Store those numbers in an ArrayList
// 3. Find the sum, product, largest and smallest of those numbers

import java.util.*;

public class SumProductArrayList {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            numbers.add(myObj.nextInt());
        }

        int sum = 0;
        int product = 1;
        for (int x : numbers) {
            sum += x;
            product *= x;
        }

        int largest = Collections.max(numbers);
        int smallest = Collections.min(numbers);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

    }
}
