package ZaurTregulov_JavaStarters;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 10:
                System.out.println("Ты учишься в школе");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
           // default:
           //    System.out.println("Ни одно из условий не подошло");
        }

    }
}
