package multidimensionalarray;

public class multidimendsionalarray {
    public static void main(String[] args) {
        int position[][]= new int[4][5];
        int a = 0;
        for (int i =0;i < 4; i++){
            for (int j = 0; j < 5; j++){
                if (a == 9)
                {
                    a = 0;
                }
                position[i][j] = a;
                a++;
            }
        }
        for (int i =0;i < 4; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(position[i][j] + " ");  //print prints only whats inside, println prints inside + new line
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        int anotherarray[][] = new int[4][];
        anotherarray[0] =  new int[1];
        anotherarray[1] =  new int[2];
        anotherarray[2] =  new int[3];
        anotherarray[3] =  new int[4];

        for (int i =0;i < 4; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(anotherarray[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
