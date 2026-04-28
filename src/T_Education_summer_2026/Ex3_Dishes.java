package T_Education_summer_2026;

import java.util.Scanner;

public class Ex3_Dishes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long MOD = 1_000_000_007L;

        // Первая пара: m * (m-1)
        long firstPair = (m % MOD) * ((m - 1) % MOD) % MOD;

        // Множитель для каждой последующей пары: m^2 - 3m + 3
        // Считаем аккуратно, чтобы не было отрицательных чисел перед %
        long multiplier = ((m % MOD * (m % MOD)) % MOD
                - (3 * (m % MOD)) % MOD
                + 3 + MOD) % MOD;

        // Возводим multiplier в степень (n-1) через быстрое возведение
        long result = (firstPair * raisingToAPower(multiplier, n - 1, MOD)) % MOD;

        System.out.println(result);
    }

    // Метод для быстрого возведения в степень (Binary Exponentiation)
    static long raisingToAPower(long base, long exponent, long mod) {
        long result = 1;
        base %= mod;
        while (exponent > 0) {
            if (exponent % 2 == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exponent /= 2;
        }
        return result;
    }
}

