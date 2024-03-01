public class arrays {
    public static void main(String[] args) {
        // [data type] [name][]
        int array[] = new int[7]; // new array with 7 variables
        // array[0] first variable, all index : 0,1,2,3,4,5,6
        array[1] = 2;
        array[2] = 3;
        array[0] = 1; // using index to set values
        array[6] = 7;
        System.out.println(array[6]);
        System.out.println(array[5]); // empty variable (for ind default is 0)
        int betterarray[] = {1,2,3,4,5,6,7}; // putting all values at creation {}
        System.out.println(betterarray[4]);
        double doublearray[] = {1.23,2.34,2.67,8.67,4.56,7.65};
        double result = 0.0; // initialize the variable !
        for(int i = 0; i <= 5; i++){
            result += doublearray[i];
        }
        result = result / 6;
        System.out.println(result);

    }

}
