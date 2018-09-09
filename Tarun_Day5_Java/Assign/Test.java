import java.util.*;

class OddPredicate implements Identify<Integer> {
    public boolean testOdd(Integer i) { 
        return i % 2 != 0; 
    }
    public boolean testPrime(Integer n)
    {
        if (n <= 1) 
            return false; 
       
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    }
}

public class Test {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4, 9, 35);
        int count = CountAll.countIfOdd(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
        count=CountAll.countIfPrime(ci, new OddPredicate());
        System.out.println("Number of prime integers = " + count);
    }
}