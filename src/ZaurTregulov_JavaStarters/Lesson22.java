package ZaurTregulov_JavaStarters;

public class Lesson22 {
    public static void main(String[] args) {

        System.out.println(Test.CONSTANT);
//        Test.CONSTANT = 10; //Нельзя установить
        final int X = 10;
        System.out.println(X);
       // X = 11; //Нельзя установить


    }
}

class Test{
    public final static int CONSTANT = 0;

}
