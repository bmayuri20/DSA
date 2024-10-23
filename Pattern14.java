import java.util.Scanner;

/* 
 * Input Format: N = 6
Result:   
A
A B
A B C
A B C D
A B C D E
A B C D E F
 */
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        nForest(n);
        sc.close();
    }

    private static void nForest(int n) {

        for (int i = 1; i <= n; i++) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {

                System.out.print(ch + " ");

            }

            System.out.println();

        }

    }
}
