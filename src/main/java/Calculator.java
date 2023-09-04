import java.util.Random;

/**
 * This a calculator class
 * */
class Calculator {
    //Comment
    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    public int fibonacciNumberFinder(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacciNumberFinder(n - 1) + fibonacciNumberFinder(n - 2);
        }
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    public String intToBinaryNumber(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2;
            binary.insert(0, remainder);
            number /= 2;
        }

        return binary.toString();
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    public String createUniqueID(String n) {
        // Create a random string of characters to make the ID unique
        StringBuilder uniqueChars = new StringBuilder();
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";

        // Add 5 random characters to the ID
        for (int i = 0; i < 5; i++) {
            uniqueChars.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Combine the original string with the unique characters
        return n + uniqueChars.toString();
    }


}
