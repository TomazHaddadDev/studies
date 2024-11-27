package ArraysAndStings;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {

    public static void main(String[] args) {
        int[][] case1 = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        int[][] case2 = {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] case3 = {
                {1, 2, 3, 4},
                {5, 6, 0, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] case4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] case5 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        System.out.println("Case 1:");
        printMatrix(zeroMatrix(case1));

        System.out.println("Case 2:");
        printMatrix(zeroMatrix(case2));

        System.out.println("Case 3:");
        printMatrix(zeroMatrix(case3));

        System.out.println("Case 4:");
        printMatrix(zeroMatrix(case4));

        System.out.println("Case 5:");
        printMatrix(zeroMatrix(case5));

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] zeroMatrix(int[][] matrix){

        List<Integer> listRow = new ArrayList<>();
        List<Integer> listColumn = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    listRow.add(i);
                    listColumn.add(j);
                    break;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(listRow.contains(i)){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(listColumn.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
