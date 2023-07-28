public class Main {
    public static void main(String[] args) {

        boolean A = 2 <= 2 && !true;

        boolean B = !false && 3 > 2;

        boolean t = false;
        boolean f = true;

        boolean C = !(! t  || f );

        boolean D = 6 > 6 ^ !(true && true);

        System.out.println("A is " + A);
        System.out.println("B is " + B);
        System.out.println("C is " + C);
        System.out.println("D is " + D);

    }
}