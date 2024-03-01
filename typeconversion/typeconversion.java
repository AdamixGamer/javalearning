public class typeconversion {
    public static void main(String[] args) {
        int jerry = 23;

        //converting to bigger type is automatic. to convert to smaller type you need to do casting
        // variable = (shortertype)variable2
        long longjerry = jerry; //automatic type conversion
        byte bytejerry = (byte)jerry; // casting
        // adding to the string automatically converts values into a string
        System.out.println(jerry + ", " + longjerry + ", " + bytejerry); 

        double score = 120.5;
        int intscore;
        intscore = (int)score; // converting between types using casting
        System.out.println(score + ", " + intscore);

        int anotherint = (int)120.5; // casting doesnt need to be used on variables

        System.out.println((byte)13.324); // this also works

        byte byte1 = 100;
        byte byte2 = 100;
        int total = byte1 * byte2; //automatic casting
        System.out.println(total);

        byte byte3 = 50;
        byte3 = (byte)(byte3 * 2); // always convers to int even if trying to save to other variables
        

    }
}
