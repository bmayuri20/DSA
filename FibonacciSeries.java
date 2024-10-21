import java.util.*;;
/**
 * FibonacciSeries
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series:");
        int num = sc.nextInt();
       
        System.out.println("Fibonacci series : ");
        generateFibonacci(num);
        sc.close();

    }

    private static void generateFibonacci(int num) {
        int a = 1, b = 1;
        for(int i = 0; i<num; i++){
            System.out.print(a + "  ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

    }
}