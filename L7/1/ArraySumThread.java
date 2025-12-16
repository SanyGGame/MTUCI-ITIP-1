public class ArraySumThread extends Thread {
    private int[] array;
    private int start;
    private int end;
    private long sum;

    public ArraySumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public long getSum() {
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int mid = array.length / 2;

        ArraySumThread t1 = new ArraySumThread(array, 0, mid);
        ArraySumThread t2 = new ArraySumThread(array, mid, array.length);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long totalSum = t1.getSum() + t2.getSum();
        System.out.println("Сумма элементов массива: " + totalSum);
    }
}
