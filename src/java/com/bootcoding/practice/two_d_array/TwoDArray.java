import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        // Close the scanner to prevent resource leak
       sc.close();
    }
}

