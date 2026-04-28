package T_Education_summer_2026;

import java.util.Scanner;

public class Ex2_Polindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int stringLength = string.length();
        int beginA = 0;
        int endA = 0;

        //count 'a' at the beginning
        for (int i = 0; i < stringLength; i++) {
            if (string.charAt(i) == 'a') beginA++;
            else break;
        }

        //a string contains only 'a'
        if (beginA == stringLength) {
            System.out.println("Yes");
            return;
        }

        //count 'a' at the ending
        for (int i = stringLength - 1; i >= 0; i--) {
            char charAtI = string.charAt(i);
            if (charAtI == 'a') endA++;
            else break;
        }

        if (beginA > endA) {
            System.out.println("No");
        } else {
            int left = 0;
            int right = stringLength - 1 - (endA - beginA);

            boolean isPalindrome = true;
            while (left < right) {
                if (string.charAt(left) != string.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}