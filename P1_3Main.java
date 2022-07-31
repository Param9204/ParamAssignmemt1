// Name :- Param Thumar
// Roll-no :-21ce144
// Aim :-Given two non-negative int values, return true if they have the same last digit, such
// as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %
// 10 is 7.
// lastDigit(7, 17) → true
// lastDigit(6, 17) → false
// lastDigit(3, 113) → true
// Git-hub repository:
import java.util.Scanner;

public class P1_3Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        P1_3 p1 = new P1_3();
         p1.stringequal(a, b);//call the constructor of class file
    }
}