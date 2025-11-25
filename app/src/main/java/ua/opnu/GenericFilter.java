package ua.opnu;

import java.util.function.Predicate;

public class GenericFilter {

    public static <T> T[] filter(T[] input, Predicate<T> predicate) {

        T[] temp = (T[]) new Object[input.length];
        int counter = 0;

        for (T elem : input) {
            if (predicate.test(elem)) {
                temp[counter++] = elem;
            }
        }

        T[] result = (T[]) new Object[counter];
        System.arraycopy(temp, 0, result, 0, counter);

        return result;
    }
}
