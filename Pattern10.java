import java.util.Scanner;

/*Input Format: N = 3
Result: 
  *  
  **
  ***  
  **
  *   
*/
public class Pattern10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        starPattern(n);
        sc.close();
    }

    private static void starPattern(int n) {
        for (int i = 0; i < n; i++) {

            for (int k = 0; k <= i; k++)
                System.out.print("*" + " ");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = n - 1; k > i; k--)
                System.out.print("*" + " ");
            System.out.println();
        }

    }
}