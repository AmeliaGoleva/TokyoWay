package plan_tokyo;

public class Passenger{
    public static void main(String[] args){
        Cats belyash = new Cats("belyash", 12, true);

        Packer.pack("Cat");
        Packer.pack("Fish", 5);
        Packer.pack("Cat", "Fish", "Chicken");

        System.out.println("\n--- Trip Started ---");
        WayPoints.printPoints(24);
    }
}

class Cats {

    private String name;
    private int age;
    private boolean isCat;

    public Cats(String name, int age, boolean isCat) {
        this.name = name;
        this.age = age;
        this.isCat = isCat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Error: Age cannot be negative.");
        } else {
            this.age = age;
        }
    }

    public void setIsCat(boolean isCat) {
        this.isCat = isCat;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }


    public boolean isCat(){
        return isCat;
    }

}

class Packer{

    public static void pack(String item){
        System.out.println("Item " + item + " has been packed into the suitcase.");
    }

    public static void pack(String item, int count){
        System.out.println("Packed " + count + " units of [" + item + "].");
    }

    public static void pack(String... items){
        System.out.println("Packing the list of items:");
        for (String item: items) {
            System.out.println(item);}
    }

}

class WayPoints{
    public static void printPoints(int kilometres){
        int partOfWay;
        partOfWay = 0;
        while (partOfWay <= kilometres){
            if (partOfWay != 0) {
                if (partOfWay % 10 == 0) {
                    System.out.println(partOfWay + " km: A big city is ahead");
                } else if (partOfWay % 5 == 0) {
                    System.out.println(partOfWay + " km: I can see an oil pump!");
                }
            }
            partOfWay +=5;
        }
    }
}