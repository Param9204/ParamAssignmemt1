// Name :- Param Thumar
// Roll-no :-21ce144
// Aim :-Implement ceaser cipher
// Git-hub repository:
import java.util.Scanner;

public class P1_10Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1, str = "";

        System.out.println("Enter Message");
        a1 = sc.nextLine();
        P1_10 abc = new P1_10();
        abc.cc(a1); //call the class file
    }
}