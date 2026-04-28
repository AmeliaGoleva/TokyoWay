package plan_tokyo;

public class TokyoTrip {
    public static void main(String[] args) {
        int alisaEnglishLevel = 10; // Это её уровень английского
        int alisaKanjiLevel = 10; // Это её уровень кандзи
        int targetLevel = 100; // Цель для переезда

        if (alisaEnglishLevel < targetLevel) {
            System.out.println("Keep going, Alisa! Tokyo is waiting!");
        } else {
            System.out.println("Pack your bags! We are flying to Ota!");
        }
    }
}
