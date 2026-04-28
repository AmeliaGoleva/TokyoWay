package ZaurTregulov_JavaStarters;

public class Arraus_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] string = new String[3];
        string[0] = "Hello";
        string[1] = "Bye";
        string[2] = "Java";
        System.out.println(string[0]);
        System.out.println(string[2]);

        int sum = 0;
        int[] numbers1 = {1,2,3};
        for(int x: numbers1) {
            sum += x;
        }
        System.out.println(sum);

        int value = 0;
        String s;
        //System.out.println(s);
    }
}
