import java.util.HashMap;

public class ProductCatalog {
    private HashMap<String, Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(String id, Product product) {
        products.put(id, product);
    }

    public Product getProduct(String id) {
        return products.get(id);
    }

    public void removeProduct(String id) {
        products.remove(id);
    }

    public void printAllProducts() {
        for (String id : products.keySet()) {
            System.out.println("ID: " + id + " -> " + products.get(id));
        }
    }
}
