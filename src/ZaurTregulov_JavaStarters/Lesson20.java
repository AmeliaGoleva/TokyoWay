package ZaurTregulov_JavaStarters;

public class Lesson20 {
    public static void main(String[] args) {
        /*
        Human.descripion = "Bad";
        Human.getDescription();
        Human h1 = new Human("Bob", 40);
        h1.description = "Nice";
        Human.getDescription();// выводит всё равно Bad, потому что она статик. Её надопереназначать иначе
        Human.descripion = "Nice";
        Human.getDescription(); //Статическая переменная одинакова ДЛЯ ВСЕХ ОБЪЕКТОВ КЛАССА
        Human h2 = new Human("Serg", 30);
        h2.getDescription(); //выводит то же значение, что и у другого Human */

        Human h1 = new Human("Bob", 40);
        h1.printNumberOfPeople();
        Human h2 = new Human("Serg", 30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        /*Human.descripion = "Bad";
        h1.getAllFields();
        h2.getAllFields();
        Human.descripion = "Nice";
        h1.getAllFields();
        h2.getAllFields();*/

        //Статические методы и статические переменные класса (например, класса Math) можно вызывать без создания объекта класса
//        System.out.println(Math.pow(2,4));
//        System.out.println(Math.PI);

    }
}

class Human {

    public Object description;
    private String name;
    private int age;
    private static int countProple;
    public static String descripion;

    //    public Human(){
//        this.name = "Default name";
//        this.age = 0;
//    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countProple ++;
        //System.out.println("Hello from the second constructor!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription(){
        System.out.println(descripion);
    }

    public void getAllFields(){
        System.out.println(name + ", " + age + ", " + descripion);
    }

    public static void printAllFields(){
       // System.out.println(name);
    }

    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countProple);
    }
}