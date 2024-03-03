package loops;

public class loops {
    public static void main(String[] args) {
        int a = 0, a2 = 0;
        int b[] = {1,4,51,78,90,24,56,78,56,78,76,57};
        while (a == 0){
            if (b[a2] ==90)
            {
                System.out.println("Found 90");
                a = 1;
            }
            a2++;
        }
        for (int i = 0; i <= b.length; i++) {
            if (b[i] ==24)
            {
                System.out.println("Found 24");
                break;
            }
        }
        do {
            System.out.println("One time activation loop");
        } while ( a == 0);
    } 
}
