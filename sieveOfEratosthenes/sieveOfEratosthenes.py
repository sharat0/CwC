def sieve_of_eratosthenes(n):
    prime_flags = [True] * (n+1)
    prime_flags[0] = prime_flags[1] = False

    for i in range(2, n + 1):
        if prime_flags[i]:
            for j in range(1, i):
                for k in range(i*i, i, i * j):
                    prime_flags[k] = False

    primes = []
    for i in range(n+1):
        if prime_flags[i]:
            primes.append(i)

    return primes

# driver code
# DO NOT EDIT THE LINES BELOW
print(sieve_of_eratosthenes(2000))
