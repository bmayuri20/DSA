import java.util.Scanner;

/*
 * Input Format: N = 3
Result: 
1
2 3
4 5 6
 */
public class Pattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        nForest(n);
        sc.close();
    }

    private static void nForest(int n) {
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
    }

}
