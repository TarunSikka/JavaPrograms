import java.util.*;
public final class CountAll {
    public static <T> int countIfOdd(Collection<T> c,Identify<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.testOdd(elem))
                ++count;
        return count;
    }
    public static <T> int countIfPrime(Collection<T> c, Identify<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.testPrime(elem))
                ++count;
        return count;
    }
}