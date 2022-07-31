// Name :- Param Thumar
// Roll-no :-21ce144
// Aim :-Given a string, return a string made of the first 2 chars (if present), however include
// first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"
// yields "oz".
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"
// Git-hub re
import java.util.*;
public class P1_2Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        String P=sc.nextLine();
        P1_2 d2 = new P1_2(P);//call the constructor of class file
    }
}