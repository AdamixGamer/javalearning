public class ifstatement {
    public static void main(String[] args) {

        boolean x = true;
        if (x) {
            System.out.println("Trueee");
        } else {
            System.out.println("Falseee");
        }

        if (!x) {
            System.out.println("Trueee");
        }
        // false == true is false
        else if (!x == x) {

        } else {
            System.out.println("Falseee");
        }

        int a = 2, b = 4;

        if (a < b) {
            System.err.println(a + " < " + b);
        }

        byte c = 120;

        // automatic casting
        if (a < c) {
            System.out.println("Trueee!  " + a + " < " + c);
        }
    }
}
