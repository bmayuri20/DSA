import java.util.Scanner;

/*
 * Input Format: N = 6
Result:   
1
01
101
0101
10101
010101
 */
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        nBinaryPattern(n);
        sc.close();
    }

    private static void nBinaryPattern(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                start = 0;
            else
                start = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

}
