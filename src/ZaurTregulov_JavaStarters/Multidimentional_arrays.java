package ZaurTregulov_JavaStarters;

public class Multidimentional_arrays {
    public static void main(String[] args){
        /**
         int[][] matrice = {{1,5,6},{9},{2,6,8,9,10}};
         System.out.println(matrice[2][0]);

         String[][] strings = new String[3][5];
         //3 &#x441;&#x442;&#x440;&#x43E;&#x43A;&#x438;,  5 &#x43A;&#x43E;&#x43B;&#x43E;&#x43D;&#x43E;&#x43A;
         //&#x412; &#x44D;&#x43B;&#x435;&#x43C;&#x435;&#x43D;&#x442;&#x430;&#x445; Null

         strings[2][0] = "Hello";
         System.out.println(strings[2][0]);
         */
        int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
    }
}
