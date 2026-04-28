package ZaurTregulov_JavaStarters;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Any name");
        person1.setAge(50);
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
//        person1.speak();
//        person1.sayHello();
//        int year1 = person1.calculateYearsToRetirements();
//        System.out.println("It’s " + year1 + " years until my retirement. ");
    }
}

class Person {

    private String name;
    private int age;

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Name is empty");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Age must be a positive number.");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirements() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", I am " + age);
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }
}