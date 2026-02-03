import javax.swing.*;

public class SparseMatrices {
    private static int[][] diagonalMatrix;
    private static int[][] lowerTriangularMatrix;
    
    public static void main(String[] args) {
        while (true) {
            String choice = JOptionPane.showInputDialog(null, "##############\nSparse Matrices\n##############\n1. Diagonal\n2. Lower triangular\n3. Print\n0. Exit\n##############\nSelect to choice number : ");
            if (choice == null || choice.equals("0")) break;
            
            switch (choice) {
                case "1":
                    diagonalMatrix = inputMatrix("Diagonal Matrix");
                    break;
                case "2":
                    lowerTriangularMatrix = inputMatrix("Lower Triangular Matrix");
                    break;
                case "3":
                    printMenu();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }

    private static int[][] inputMatrix(String matrixType) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter matrix size (NxN):"));
        int[][] matrix = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String element = JOptionPane.showInputDialog("Enter " + matrixType + " element at position [" + i + "][" + j + "]:");
                matrix[i][j] = Integer.parseInt(element);
            }
        }
        return matrix;
    }
    
    private static void printMenu() {
        while (true) {
            String choice = JOptionPane.showInputDialog(null, "##############\nSub Menu Print\n##############\n1. Row-Major Mapping\n2. Column-Major Mapping\n0. Return to Main menu\n##############\nSelect to Choice number :");
            if (choice == null || choice.equals("0")) break;
            
            switch (choice) {
                case "1":
                    printMatrices("Row");
                    break;
                case "2":
                    printMatrices("Column");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }
    
    private static void printMatrices(String order) {
        StringBuilder output = new StringBuilder();
        
        if (diagonalMatrix != null) {
            output.append("Print Diagonal Matrix\n").append(matrixToString(diagonalMatrix)).append("\n");
            output.append(order).append("-Major Mapping\n").append(mappingToString(diagonalMatrix, order)).append("\n");
        }
        
        if (lowerTriangularMatrix != null) {
            output.append("Print Lower Triangular Matrix\n").append(matrixToString(lowerTriangularMatrix)).append("\n");
            output.append(order).append("-Major Mapping\n").append(mappingToString(lowerTriangularMatrix, order)).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, output.toString());
    }
    
    private static String matrixToString(int[][] matrix) {
        StringBuilder result = new StringBuilder();
        for (int[] row : matrix) {
            for (int val : row) {
                result.append(val).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
    
    private static String mappingToString(int[][] matrix, String order) {
        StringBuilder values = new StringBuilder();
        int size = matrix.length;
        
        if (order.equals("Row")) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (matrix[i][j] != 0) values.append(matrix[i][j]).append(" ");
                }
            }
        } else {
            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size; i++) {
                    if (matrix[i][j] != 0) values.append(matrix[i][j]).append(" ");
                }
            }
        }
        return values.toString().trim();
    }
}
