import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter N");
            int n = sc.nextInt();
            nForest(n);
        }
    }

    private static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    /*
     * Example 1:
     * Input: N = 3
     * Output:
            * * *
            * * *
            * * *
     */
}