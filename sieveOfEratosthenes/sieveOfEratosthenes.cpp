#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

/*
 * START DEBUGGING THE METHOD BELOW
 */
vector<int> sieve_of_eratosthenes(int n) {
    vector<bool> prime_flags(n+1, true);
    vector<int> primes;

    prime_flags[0] = prime_flags[1] = false;

    for (int i = 2; i <= n; i++) {
        if (prime_flags[i]) {
            for (int j = 1; j <= i; j++) {
                for (int k = i*i; k <= i; k += i * j) {
                    prime_flags[k] = false;
                }
            }
        }
    }

    for (int i = 2; i <= n; i++) {
        if (prime_flags[i]) {
            primes.push_back(i);
        }
    }

    return primes;
}


  /*
   * driver code
   * DO NOT CHANGE THE LINES BELOW
   */
int main() {
    vector<int> primes = sieve_of_eratosthenes(2000);

    for (int prime : primes) {
        cout << prime << " ";
    }
    cout << endl;
    return 0;
}

