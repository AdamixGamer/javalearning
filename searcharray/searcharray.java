package searcharray;

import java.util.Arrays;

public class searcharray {
    public static void main(String[] args) {
            int numbers[] = {12,-12,2426,58758,-4546,4647,-47886,56782,-1244,-54747};
            System.out.println(Arrays.toString(numbers));  //method on arryay converting array into string
            int tofind = -12;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == tofind)
                {
                    System.out.println("Found " + tofind);
                    break;
                }
                else if (i==numbers.length -1) {
                    System.out.println("Number not found");
                }
            }
        }
}
