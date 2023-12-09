import java.util.Scanner;

public class TwoArrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows you want to enter: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns you want to enter: ");
        int col = sc.nextInt();
        int[][] nam = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                nam[i][j] = sc.nextInt(); 
            }
        }

        // sum for rows

        int sum = 0;
        for (int i = 0; i < row; i++) {
            int rsum = 0;
            for (int j = 0; j < col; j++) {
                rsum += nam[i][j];
            }
            System.out.println("sum of row"+(i+1)+ " " + " is " + rsum);
        }
        System.out.println();

            // sum for columns

        for (int i = 0; i < row; i++) {
            int csum = 0;
            for (int j = 0; j < col; j++) {
                csum += nam[j][i];
            }
            System.out.println("sum of col"+(i+1)+ " " + " is " + csum);
        }
        System.out.println();

        // max number
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < nam[i][j]) {
                    max = nam[i][j];
                } 
            }
        }
        System.out.println("maximum number is " + max);

        // max number in rows
        
        for (int i = 0; i < row; i++) {
            int max1 = 0;
            for (int j = 0; j < col; j++) {
                if (max1 < nam[i][j]) {
                    max1 = nam[i][j];
                } 
            }
            System.out.println("maximum number in row " + (i+1) + " is " + max1);
        }
        System.out.println();
        
        // max number in col
        
        for (int i = 0; i < row; i++) {
            int max2 = 0;
            for (int j = 0; j < col; j++) {
                if (max2 < nam[j][i]) {
                    max2 = nam[j][i];
                } 
            }
            System.out.println("maximum number in col " + (i+1) + " is " + max2);
        }
        System.out.println();
    }
}
