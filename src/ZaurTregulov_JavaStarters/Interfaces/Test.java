package ZaurTregulov_JavaStarters.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.showInfo();
        person1.showInfo();

        //полиморфизм
        //ограничение методов объекта Animal методами интерфейса, который он реалзует (имплементирует)
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        Animal dfdf = new Info();

    }
}
