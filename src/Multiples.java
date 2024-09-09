public class Multiples {
    public static void main(String[] args) {
        int result = 0;
        doMultiples(result);
    }

    private static void doMultiples(int result) {
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {
                System.out.println(i);
                result++;
            }
        }
    }
}
