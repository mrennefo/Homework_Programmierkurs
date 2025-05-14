package Homework6.Exercise1;

public class MatrixMultMain {

    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4},
        };

        int[][] B = {
                {5, 6},
                {7, 9}
        };

        int[][] result = matrixMult(A, B);

        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMult(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        DotProductThread[][] threads = new DotProductThread[rowsA][colsB];
        if(rowsA == colsB) {
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    int[] column = new int[colsB];
                    for (int k = 0; k < colsB; k++) {
                        column[k] = B[k][j];                    //Speichere alle Werte aus der k-ten Spalte in column
                    }
                    threads[i][j] = new DotProductThread(A[i], column);  // Berechne das Skalarprodukt aus Zeilen und Spalten
                    threads[i][j].start(); // Falls .run() statt .start() verwendet wird laufen alle operationen sequenziell und nicht parallel ab, wodurch keine Zeit ersparnis entsteht
                }
            }

            for(int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    try{
                        threads[i][j].join();
                        result[i][j] = threads[i][j].getDot();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return result;
    }
}
