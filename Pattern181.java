import java.util.*;
/*   output
E
D E
C D E
B C D E 
A B C D E */
public class Pattern181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        nForest(n);
        sc.close();
    }

    private static void nForest(int n) {
        
        for (int i = 0; i < n; i++) {
            
             for (char ch=(char)('A'+n-1-i); ch<=(char)('A'+n-1); ch++ ) {
                
                 System.out.print(ch + " ");
                 
             }
             
             System.out.println();
       
    }
}
    
}
