package plan_tokyo;

public class RescueSystem {
    public static void main(String[] args) {
        int floor = 6;
        boolean isWaterInRoom = true;

        if (isWaterInRoom && floor >= 6) {
            System.out.println("Вы в безопасности, это просто брызги.");
            System.out.println("Вызываем желто-бирюзовую скорую!");
        } else {
            System.out.println("Следуем плану эвакуации на холм Магомэ.");
        }
    }
}
