public class MatrixMaxThread extends Thread {
    private int[] row;
    private int max;

    public MatrixMaxThread(int[] row) {
        this.row = row;
        this.max = row[0];
    }

    @Override
    public void run() {
        for (int value : row) {
            if (value > max) {
                max = value;
            }
        }
    }

    public int getMax() {
        return max;
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = {
                {3, 5, 1, 9},
                {7, 2, 8, 4},
                {6, 10, 0, 2},
                {1, 4, 3, 7}
        };

        MatrixMaxThread[] threads = new MatrixMaxThread[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            threads[i] = new MatrixMaxThread(matrix[i]);
            threads[i].start();
        }

        int globalMax = matrix[0][0];

        for (MatrixMaxThread thread : threads) {
            thread.join();
            if (thread.getMax() > globalMax) {
                globalMax = thread.getMax();
            }
        }

        System.out.println("Наибольший элемент матрицы: " + globalMax);
    }
}
