package ua.opnu;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== MyOptional ===");
        MyOptional<String> empty = new MyOptional<>();
        MyOptional<String> username = new MyOptional<>("admin");

        System.out.println(empty);
        System.out.println(username);
        System.out.println("orElse: " + empty.orElse("немає"));

        try {
            empty.get();
        } catch (Exception e) {
            System.out.println("Очікувана помилка: " + e.getMessage());
        }

        System.out.println("\n=== BookData Comparable ===");
        BookData b1 = new BookData("Java 101", "Smith", 10, 45);
        BookData b2 = new BookData("Python Basics", "John", 5, 30);
        BookData b3 = new BookData("Java 101", "Smith", 10, 45);

        System.out.println(b1.compareTo(b2));
        System.out.println(b1.compareTo(b3));

        System.out.println("\n=== Printer ===");
        Printer printer = new Printer();
        printer.printArray(new Integer[]{1, 2, 3});
        printer.printArray(new String[]{"Hello", "World"});

        System.out.println("\n=== Generic filter ===");
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] even = GenericFilter.filter(arr, x -> x % 2 == 0);
        for (int i : even) System.out.println(i);

        System.out.println("\n=== Generic contains ===");
        String[] words = {"cat", "dog", "bird"};
        System.out.println(GenericContains.contains(words, "dog"));
        System.out.println(GenericContains.contains(words, "fish"));

        System.out.println("\n=== Generic Tuples ===");
        GenericTwoTuple<String, Integer> t1 = new GenericTwoTuple<>("age", 25);
        System.out.println(t1);

        GenericThreeTuple<String, Integer, Double> t2 =
                new GenericThreeTuple<>("John", 5, 44.5);
        System.out.println(t2);
    }
}
