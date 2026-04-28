package T_Education_summer_2026;

import java.util.Scanner;

public class Ex4_Cash {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Читаем количество дней
            int n = scanner.nextInt();

            // 2. Читаем цены в массив
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = scanner.nextLong();
            }

            // Если дней меньше 2, торговать нельзя
            if (n < 2) {
                System.out.println(0);
                return;
            }

            // 3. Считаем максимальную прибыль для ПЕРВОЙ сделки (слева направо)
            long[] left = new long[n];
            long minSoFar = p[0];
            for (int i = 1; i < n; i++) {
                // Либо прибыль была раньше, либо продаем сегодня (сегодняшняя цена - минимум в прошлом)
                if (p[i] < minSoFar) minSoFar = p[i];
                left[i] = Math.max(left[i - 1], p[i] - minSoFar);
            }

            // 4. Считаем максимальную прибыль для ВТОРОЙ сделки (справа налево)
            long[] right = new long[n];
            long maxSoFar = p[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                // Либо прибыль будет позже, либо покупаем сегодня (максимум в будущем - сегодняшняя цена)
                if (p[i] > maxSoFar) maxSoFar = p[i];
                right[i] = Math.max(right[i + 1], maxSoFar - p[i]);
            }

            // 5. Ищем лучший день для разделения сделок
            long totalMax = 0;
            for (int i = 0; i < n; i++) {
                // Суммируем лучшую сделку "до дня i" и лучшую "после дня i"
                long currentSum = left[i] + right[i];
                if (currentSum > totalMax) {
                    totalMax = currentSum;
                }
            }

            // 6. Выводим результат
            System.out.println(totalMax);
        }
}
