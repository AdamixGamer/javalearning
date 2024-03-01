public class booleanoperators {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        System.out.println(x & x); // AND
        System.out.println(x & y);

        System.out.println(x | y); // OR
        System.out.println(x | x);

        System.out.println(x ^ y); // XOR
        System.out.println(x ^ x);
        System.out.println(y ^ x);

        System.out.println(!x); // NOT
        System.out.println(!y);
    }
}
