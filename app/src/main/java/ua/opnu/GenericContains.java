package ua.opnu;

public class GenericContains {

    public static <T extends Comparable<T>, V extends T> boolean contains(T[] array, V element) {
        for (T t : array) {
            if (t.compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }
}
