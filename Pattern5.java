import java.util.Scanner;

/*
 * Input Format: N = 6
Result:
* * * * * *
* * * * * 
* * * * 
* * * 
* * 
* 
 */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        nForest(n);
        sc.close();
    }

    private static void nForest(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
