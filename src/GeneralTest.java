import java.util.ArrayList;

public class GeneralTest {

    // Q1
    // this function calculates the sum of the first "count" even fibonacci numbers
    public static long fibonacciNumbers(int count) {
        // store the sum and the number of the even integers we've added so far
        long sum = 0;
        int currentCount = 0;

        // store the last two numbers
        long previous = 1;
        long current = 1;

        //  a loop to increment the last two numbers and add them to the sum if even
        while (currentCount < count) {
            long tCurrent = current;
            current = previous + current;
            previous = tCurrent;

            // add the number to the sum if eve na nd increment the counter
            if (current % 2 == 0) {
                sum += current;
                currentCount++;
                //System.out.println(current);
            }
        }
        return sum;
    }

    // Q2
    // this function returns the common elements in two lists
    // this modifies listA and there is likely a faster way of doing it if I wrote some custom code, taking into account
    // that the two lists are sorted. The current implementation likely has a time complexity of O(n^2).
    public static ArrayList<Integer> sortedArrays(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        listA.retainAll(listB);
        return listA;
    }

    // Q3
    // returns true if the int is positive and has no odd digits
    public static boolean noOddDigits(int i) {
        // return false if negative
        if (i < 0) return false;

        // convert to String
        String iS = Integer.toString(i);

        // iterate through String and return false if odd number found
        for (char ch : iS.toCharArray()) {
            if (Character.getNumericValue(ch) % 2 == 1) {
                return false;
            }
        }
        // return true otherwise
        return true;
    }

    // Q4
    // return the value of xxxx + xxx + xx + x for any given x
    public static Integer returnSum(int i) {
        if (i <= 9) {
            return i*1000 + i*200 + i*30 + i*4;
        } else {
            return null;
        }
    }

    // Q2 from Java questions
    // return whether the brackets are balanced or not
    public static boolean balancedBrackets(String brackets) {
        int braces = 0;
        int sqb = 0;
        int parentheses = 0;

        for (char ch : brackets.toCharArray()) {
            switch (ch) {
                case '{' -> braces++;
                case '}' -> braces--;
                case '[' -> sqb++;
                case ']' -> sqb--;
                case '(' -> parentheses++;
                case ')' -> parentheses--;
            }
        }
        return braces == 0 && sqb == 0 && parentheses == 0;
    }
}
