import java.util.Scanner;

/*
 * Input Format: N = 3
Result: 
  *  
 *** 
***** 
 */
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        starPattern(n);
        sc.close();
    }

    private static void starPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("*" + " ");
            System.out.println();
        }
    }

}
