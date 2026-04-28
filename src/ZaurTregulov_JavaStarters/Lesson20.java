package ZaurTregulov_JavaStarters;

public class Lesson20 {
    public static void main(String[] args){
        Human person1 = new Human("Bob", 50);
    }
}

class Human{

    private String name;
    private int age;

    public Human(){
        this.name = "Default name";
        this.age = 0;
    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Hello from the second constructor!");
    }

    public void setName(String name){this.name = name; }

    public void setAge(int age) {this.age = age; }
}