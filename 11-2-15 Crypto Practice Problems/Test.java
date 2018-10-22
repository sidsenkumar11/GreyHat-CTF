import java.util.ArrayList;
import java.util.List;

public class Test {

  public static List<Long> primeFactors(long numbers) {
    long n = numbers;
    List<Long> factors = new ArrayList<Long>();
    for (long i = 2; i <= n / i; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }
    if (n > 1) {
      factors.add(n);
    }
    return factors;
  }

  public static void main(String[] args) {
    System.out.println("Prime factors of n");

    long n = 10436872429L;
    List<Long> factors = new ArrayList<Long>();
    for (long i = 2; i <= n / i; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }
    if (n > 1) {
      factors.add(n);
    }



    for (Long integer : factors) {
      System.out.println(integer);
    }

  }
} 