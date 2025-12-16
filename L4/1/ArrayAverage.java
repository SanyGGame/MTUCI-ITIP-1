public class ArrayAverage {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 5, 4, 5};
        double sum = 0;
        int count = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                sum += ((Number) arr[i]).doubleValue();
                count++;
            }
            double average = sum / count;
            System.out.println("Среднее арифметическое: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка выхода за границы: " + e.getMessage());
        } catch (ClassCastException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }
    }
}
