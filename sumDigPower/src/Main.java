import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(SumDigPower.sumDigPow(1,10));


    }
}
class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long i = a; i <= b; i++)
            if(isEureka(i))
                result.add(i);
        return result;
    }

    private static boolean isEureka(long n) {
        long tmp = n;
        long sum = 0;
        int power = length(n);
        while (tmp > 0) {
            sum += (long) Math.pow(tmp % 10, power);
            tmp /= 10;
            power--;
        }
        return sum == n;
    }

    private static int length(long n) {
        int length = 0;
        while (n > 0) {
            n /= 10;
            length++;
        }
        return length;
    }
}