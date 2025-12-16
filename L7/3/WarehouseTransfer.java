import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WarehouseTransfer {

    // Товар
    static class Product {
        private final int weight;

        public Product(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    // Склад
    static class Warehouse {
        private final Queue<Product> products = new LinkedList<>();

        public Warehouse(int[] weights) {
            for (int w : weights) {
                products.add(new Product(w));
            }
        }

        public synchronized Product takeProduct() {
            return products.poll();
        }

        public synchronized boolean isEmpty() {
            return products.isEmpty();
        }
    }

    // Грузчик
    static class Loader implements Runnable {

        private static final int MAX_WEIGHT = 150;
        private final Warehouse warehouse;
        private final String name;

        public Loader(Warehouse warehouse, String name) {
            this.warehouse = warehouse;
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                int currentWeight = 0;

                while (currentWeight < MAX_WEIGHT) {
                    Product product;

                    synchronized (warehouse) {
                        if (warehouse.isEmpty()) {
                            break;
                        }
                        product = warehouse.takeProduct();
                    }

                    if (product == null) {
                        break;
                    }

                    if (currentWeight + product.getWeight() > MAX_WEIGHT) {
                        break;
                    }

                    currentWeight += product.getWeight();
                    System.out.println(name + " взял товар "
                            + product.getWeight() + " кг (итого "
                            + currentWeight + " кг)");
                }

                if (currentWeight == 0) {
                    break;
                }

                System.out.println(name + " перевозит "
                        + currentWeight + " кг на другой склад");

                try {
                    Thread.sleep(1000); // разгрузка
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println(name + " завершил работу");
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) {

        int[] weights = {40, 30, 50, 20, 60, 10, 70, 30, 40, 20};

        Warehouse warehouse = new Warehouse(weights);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new Loader(warehouse, "Грузчик 1"));
        executor.execute(new Loader(warehouse, "Грузчик 2"));
        executor.execute(new Loader(warehouse, "Грузчик 3"));

        executor.shutdown();
    }
}
