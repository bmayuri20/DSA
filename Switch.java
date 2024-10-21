import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        List<Double> arr = new ArrayList<Double>();
        Solution ob = new Solution();
        if (choice == 1) {
            System.out.println("Enter the radius of the circle: ");
            arr.add(sc.nextDouble()); // Add radius to the list
            System.out.println(String.format("%.2f", ob.switchCase(choice, arr)));
        } else if (choice == 2) {
            System.out.println("Enter the length of the rectangle: ");
            arr.add(sc.nextDouble()); // Add length to the list
            System.out.println("Enter the breadth of the rectangle: ");
            arr.add(sc.nextDouble()); // Add breadth to the list
            System.out.println((int) ob.switchCase(choice, arr));
        } else
            System.out.println("Invalid choice.");
        sc.close();
    }

}

class Solution {
    double switchCase(int choice, List<Double> arr) {
        switch (choice) {
            case 1:
                double R = arr.get(0);
                return Math.PI * R * R;
            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                return L * B;
            default:
                return -1;
        }
    }
}