import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
}

public class SalesManager {
    private List<Product> soldProducts;

    public SalesManager() {
        soldProducts = new LinkedList<>();
    }

    public void sellProduct(Product product) {
        soldProducts.add(product);
    }

    public void showSoldProducts() {
        System.out.println("--Список проданных товаров--");
        for (Product product : soldProducts) {
            System.out.println(product.getName() + ": " + product.getPrice() + " руб.");
        }
    }

    public int getTotalSales() {
        int total = 0;
        for (Product product : soldProducts) {
            total += product.getPrice();
        }
        return total;
    }

    public String getMostPopularProduct() {
        if (soldProducts.isEmpty()) return "Нет продаж";

        Map<String, Integer> countMap = new HashMap<>();
        for (Product product : soldProducts) {
            String name = product.getName();
            if (countMap.containsKey(name)) {
                countMap.put(name, countMap.get(name) + 1);
            } else {
                countMap.put(name, 1);
            }
        }

        String popular = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                popular = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return popular;
    }

    public static void main(String[] args) {
        SalesManager manager = new SalesManager();

        manager.sellProduct(new Product("PS5", 50));
        manager.sellProduct(new Product("PS5", 50));
        manager.sellProduct(new Product("XBox", 35));
        manager.sellProduct(new Product("Steam Deck", 40));
        manager.sellProduct(new Product("PS5", 50));
        manager.sellProduct(new Product("Steam Deck", 40));

        manager.showSoldProducts();
        System.out.println("Общая сумма продаж: " + manager.getTotalSales() + " руб.");
        System.out.println("Наиболее популярный товар: " + manager.getMostPopularProduct());
    }
}
