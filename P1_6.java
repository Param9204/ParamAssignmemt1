import java.util.*;

public class P1_6 {
    P1_6(String[] x, String y) {
        int z = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(y)) {
                z++;// checking if any string in the string array is same as the target string.
            }
        }
        z = x.length - z;// removing the length of the string same as target.
        int place = 0;
        String[] str = new String[z];// making a new array for the remaining elements of original array.
        for (int j = 0; j < x.length; j++) {
            if (!x[j].equals(y)) {
                str[place] = x[j];// string element not equal to target are placed in new array.
                place++;
            }
        }
        System.out.println(Arrays.toString(str));
    }
}