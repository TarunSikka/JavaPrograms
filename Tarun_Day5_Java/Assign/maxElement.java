import java.util.*;
class maxElement
{
    public static <T extends Object & Comparable<? super T>> T max (List<? extends T> list,
                                                                    int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin) {
            if (maxElem.compareTo(list.get(begin)) < 0) maxElem = list.get(begin);
        }
        return maxElem;
    }
    public static void main(String args[])
    {
        List<Integer> c = Arrays.asList(1, 2, 11, 3, 5, 6, 7, 9, 10, 12);
        List<Double> d= new ArrayList<>(Arrays.asList(1.0, 2.2, 3.5, 2.8, 8.1, 1.6, 2.4, 7.4));
        System.out.println(maxElement.max(c, 3, 9));
        System.out.println(maxElement.max(d, 3, 8));
    }
}