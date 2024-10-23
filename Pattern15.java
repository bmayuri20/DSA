import java.util.Scanner;

/*
 * Input Format: N = 6
Result:   
A B C D E F
A B C D E 
A B C D
A B C
A B
A
 */
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        nForest(n);
        sc.close();
    }

    private static void nForest(int n) {

        for (int i = n; i >= 1; i--) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {

                System.out.print(ch + " ");

            }

            System.out.println();

        }

    }

}
