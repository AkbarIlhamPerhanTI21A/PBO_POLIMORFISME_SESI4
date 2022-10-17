
/**
 * PBO Sesi 4
 * Akbar Ilham Perhan
 * 20210040083
 * TI21A
 * Poliforfisme Overloading 
 */

package PBO;


class ParameterNomor {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
}
