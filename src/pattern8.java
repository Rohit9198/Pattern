public class pattern8 {
    public static void main(String[] args) {

        int n = 5;

        // Upper Pyramid
        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Inverted Pyramid
        for (int i = 1; i < n; i++) {

            // Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}