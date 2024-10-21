import java.util.Scanner;

class ReverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no ");
        int n = sc.nextInt();
        Table obj = new Table();
        obj.printReverseTable(n);

        sc.close();
    }
}

class Table {
     public void printReverseTable(int n) {
        int multiplier = 10;
        while (multiplier > 0) {
            System.out.print(n * multiplier + "  ");
            multiplier--;
        }
    }
}
