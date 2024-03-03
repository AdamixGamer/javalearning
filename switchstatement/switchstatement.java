package switchstatement;

public class switchstatement {
    public static void main(String[] args) {
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
            case 4:
                System.out.println("Case 3 or 4");
                break;
            default:
                System.out.println("wrong case");
        }
    }
}
