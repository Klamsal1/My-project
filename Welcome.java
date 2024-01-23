public class Welcome {

    public static void main(String[] args) {

                int n = 3;  // Number of rows in the first part of the pattern

                // Print the upper part of the pattern
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                // Print the lower part of the pattern
                for (int i = n - 1; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }



