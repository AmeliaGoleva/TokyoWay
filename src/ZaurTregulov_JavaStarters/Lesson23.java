package ZaurTregulov_JavaStarters;

import java.sql.SQLOutput;

public class Lesson23 {
    public static void main(String[] args){
        /*tring x = "Hello";
        x.toUpperCase();
        System.out.println(x);
        x = x.toUpperCase();
        System.out.println(x);*/
        /*String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1+string2+string3;
        System.out.println(stringAll);*/

        /*StringBuilder sb = new StringBuilder();
        System.out.println("start:");
        System.out.println(sb);
        System.out.println("stop");*/

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());

        System.out.printf("%fThis is %s a string, %d\n", 10.4, "HIHI", 1000);
        //10,400000This is HIHI a string, 1000
        System.out.printf("Hello %-10d\n",532);
        System.out.printf("Hello %d\n",5);
        System.out.printf("Hello %-10d\n",10000);
        System.out.printf("Hello %10d\n",100000000);


    }
}
