import java.util.Scanner;

public class SortTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows you want to enter: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns you want to enter: ");
        int col = sc.nextInt();
        //int max = 100000;
        int[][] nam = new int[row][col];
        System.out.println(nam.length);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                nam[i][j] = sc.nextInt(); 
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
              for (int j2 = 0; j2 < row; j2++) {
                for (int k = 0; k < col; k++) {
                    if (nam[i][j] < nam[j2][k]) {
                        int temp = nam[j2][k];
                        nam[j2][k] = nam[i][j];
                        nam[i][j] = temp;
                    }
                }
              } 
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(nam[i][j] + " ");
            }
            System.out.println("");
        }


    }
}
