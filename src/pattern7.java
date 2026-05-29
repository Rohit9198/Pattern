public class pattern7 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            // Next line
            System.out.println();
        }
    }
}