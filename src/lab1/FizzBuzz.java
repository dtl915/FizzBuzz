package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int cnt = 1;
        while (cnt <= 100) {

            doFizzBuzz(cnt);
            cnt += 1;
        }
    }

    static void doFizzBuzz(int cnt) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = cnt % 3 == 0;
        boolean divisibleBy5 = cnt % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(cnt);

        }
    }
}
