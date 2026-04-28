package ZaurTregulov_JavaStarters;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;  //примитивный тип данных
//        char character = 'a';  //примитивный тип данных
//        String  s = "Hello";
//        String s1 = new String("Hello");
        int[] numbers = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 20;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i * 10;
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
