public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Product p1 = new Product("Ноутбук", "Intel i5, 8GB RAM", 750.0, 10);
        Product p2 = new Product("Смартфон", "Android, 128GB", 500.0, 25);

        catalog.addProduct("AGKDL", p1);
        catalog.addProduct("FAKFJ", p2);

        System.out.println("Поиск товара по AGKDL:");
        System.out.println(catalog.getProduct("AGKDL"));

        System.out.println("\nВсе товары:");
        catalog.printAllProducts();

        catalog.removeProduct("AGKDL");

        System.out.println("\nПосле удаления AGKDL:");
        catalog.printAllProducts();
    }
}
