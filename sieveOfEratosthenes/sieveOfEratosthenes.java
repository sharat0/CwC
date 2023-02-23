import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    
    /*
     * START DEBUGGING THE METHOD BELOW
     */
    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean[] primeFlags = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            primeFlags[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            if (primeFlags[i]) {
                for (int j = 1; j <= i; j++) {
                    for (int k = i*i; k <= i; k += i * j) {
                        primeFlags[k] = false;
                    }
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primeFlags[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    /*
     * driver code
     * DO NOT CHANGE THE LINES BELOW
     */
    public static void main(String[] args) {
        List<Integer> primes = sieveOfEratosthenes(2000);
        System.out.println(primes); 
    }
}
