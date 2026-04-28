package plan_tokyo;

public class EarthquakeSensor {
    public static void main(String[] args) {
        //Сила толчка (магнитуда)
        double magnitude = 7.4;

        //Настроение единорога (если true - это просто игра)
        boolean isUnicornJumping = true;

        System.out.println("--- Система оповещения Ота запущена ---");

        if (magnitude > 5.0 && !isUnicornJumping) {
            System.out.println("ВНИМАНИЕ! Это не единорог! Срочно под стол!");
            System.out.println("Эвакуация в парк Синагава к пингвинам!");
        } else if (isUnicornJumping) {
            System.out.println("Все спокойно. Это Алиса и её единорог скачут по радуге.");
        } else {
            System.out.println("Легкая вибрация. Просто Токио живет своей жизнью.");
        }
    }
}
