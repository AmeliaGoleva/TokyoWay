package ZaurTregulov_JavaStarters;

public class Lesson19 {
    public static void main(String[] args) {
        Human19 human1 = new Human19();
        human1.setName("Tom");
        human1.setAge(18);
        human1.getInfo();

        Human19 human2 = new Human19();
        human2.setName("Bob");
        human2.setAge(20);
        human2.getInfo();
    }
}

class Human19 {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println(name + ", " +age);
    }

}
