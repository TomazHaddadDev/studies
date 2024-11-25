package ArraysAndStings;

public class RotateMatrix {

    public static void main(String[] args) {
        char[][] matrix1 = {
                {'A', 'B'},
                {'C', 'D'}
        };
        rotateMatrix(matrix1);
        printMatrix(matrix1);

        // Caso 2: Matriz 3x3
        char[][] matrix2 = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
        rotateMatrix(matrix2);
        printMatrix(matrix2);

        // Caso 3: Matriz 4x4
        char[][] matrix3 = {
                {'A', 'B', 'C', 'D'},
                {'E', 'F', 'G', 'H'},
                {'I', 'J', 'K', 'L'},
                {'M', 'N', 'O', 'P'}
        };
        rotateMatrix(matrix3);
        printMatrix(matrix3);

        // Caso 4: Matriz 5x5
        char[][] matrix4 = {
                {'A', 'B', 'C', 'D', 'E'},
                {'F', 'G', 'H', 'I', 'J'},
                {'K', 'L', 'M', 'N', 'O'},
                {'P', 'Q', 'R', 'S', 'T'},
                {'U', 'V', 'W', 'X', 'Y'}
        };
        rotateMatrix(matrix4);
        printMatrix(matrix4);

        // Caso 5: Matriz com letras repetidas
        char[][] matrix5 = {
                {'A', 'A', 'A'},
                {'B', 'B', 'B'},
                {'C', 'C', 'C'}
        };
        rotateMatrix(matrix5);
        printMatrix(matrix5);

        // Caso 6: Matriz 1x1
        char[][] matrix6 = {
                {'A'}
        };
        rotateMatrix(matrix6);
        printMatrix(matrix6);

        // Caso 7: Matriz 2x2 com letras diferentes
        char[][] matrix7 = {
                {'X', 'Y'},
                {'Z', 'W'}
        };
        rotateMatrix(matrix7);
        printMatrix(matrix7);

        // Caso 8: Matriz 3x3 com valores diversos
        char[][] matrix8 = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
        rotateMatrix(matrix8);
        printMatrix(matrix8);
    }

    public static char[][] rotateMatrix(char[][] matrix){
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            for (int i = layer; i < n - 1 - layer; i++) {
                char aux = matrix[layer][i];  // superior esquerdo
                char aux2 = matrix[i][n - 1 - layer];  // superior direito
                char aux3 = matrix[n - 1 - layer][n - 1 - i];  // inferior direito
                char aux4 = matrix[n - 1 - i][layer];  // inferior esquerdo

                matrix[layer][i] = aux4;
                matrix[i][n - 1 - layer] = aux;
                matrix[n - 1 - layer][n - 1 - i] = aux2;
                matrix[n - 1 - i][layer] = aux3;
            }
        }
        return matrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return;
    }
}
