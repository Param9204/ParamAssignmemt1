// Name :- Param Thumar
// Roll-no :-21ce144
// Aim :-Display numbers in a pyramid pattern.
//                 1
//               1 2 1
//             1 2 4 2 1
//           1 2 4 8 4 2 1
//         1 2 4 8 16 8 4 2 1
//      1 2 4 8 16 32 16 8 4 2 1
//   1 2 4 8 16 32 64 32 16 8 4 2 1
// 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
// Git-hub repository:
import java.util.Scanner;

public class P1_7Main {
    public static void main(String[] args) {
        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string  which you want to remove");
        row = sc.nextInt();
        P1_7 d7=new P1_7();//calls the constructor of the class file
        sc.close();
    }
}
