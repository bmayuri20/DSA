import java.util.Scanner;
/*
 * Input Format: N = 6
Result:   
     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 
ABCDEFEDCBA
 */
public class Pattern17 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        starPattern(n);
        sc.close();
    }

    private static void starPattern(int N) {
        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            // Print increasing sequence of characters
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j + 64));
            }
            
            // Print decreasing sequence of characters
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(j + 64));
            }
            
            // Move to the next line
            System.out.println();
        }
    }

    
}
