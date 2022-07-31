// Name :- Param Thumar
// Roll-no :-21ce144
// Aim :-Given an array of strings, return a new array without the strings that are equal to
// the target string. One approach is to count the occurrences of the target string, make
// a new array of the correct length, and then copy over the correct strings.
// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
// Git-hub repository:
import java.util.*;
public class P1_6Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] m = new String[5];
        String x1;
        System.out.println("Enter the array of String");
        for(int i=0;i<5;i++)
        {
            m[i] = sc.next();
        }
        System.out.println("Enter the target String");
        x1 = sc.next();
        P1_6 d6 = new P1_6(m,x1);
        sc.close();
    }
}

