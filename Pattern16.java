import java.util.Scanner;

/*
 * Input Format: N = 3
Result: 
A
B B
C C C
 */
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        nForest(n);
        sc.close();
    }

    // Runtime = 862 ms
    private static void nForest(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i) + " ");
            }
            System.out.println();
        }
    }
    // Runtime = 521 ms
    /*
     * private static void nForest(int n) {
     * char m='A';
     * for (int i = 1; i <= n; i++) {
     * for (int j = 1; j <=i; j++) {
     * System.out.print(m + " ");
     * 
     * }
     * m++;
     * System.out.println();
     * }
     * }
     */

}
