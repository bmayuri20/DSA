import java.util.Scanner;
/*
 * Enter N
4
D
D C
D C B
D C B A
 */
public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        nForest(n);
        sc.close();
    }

    private static void nForest(int n) {
        
        for (int i = 1; i <= n; i++) {
            char ch=(char)('A'+n-1);
             for (int j =1 ; j <= i; j++) {
                
                 System.out.print(ch + " ");
                 ch--;
             }
             
             System.out.println();
       
    }
}
}
