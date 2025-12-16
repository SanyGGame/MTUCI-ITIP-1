public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> table = new HashTable<>();

        table.put("artem", 19);
        table.put("nikita", 21);
        table.put("andrey", 20);
        table.put("alexey", 19);

        table.printTable();
        System.out.println("Размер таблицы:" + table.size());

        System.out.println("Значение по ключу 'artem': " + table.get("artem"));
        table.remove("alexey");

        System.out.println("После удаления 'alexey':");
        table.printTable();
        System.out.println("Размер таблицы:" + table.size());

        System.out.println("Пуста ли таблица: " + table.isEmpty());
    }
}
