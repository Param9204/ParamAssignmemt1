// Name :- Param Thumar
// Roll-no :-21ce144
// Aim :-The problem is to check whether a given Sudoku solution is correct.
// Git-hub repository:
import java.util.*;
public class P1_9Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] sudoku = new char[9][9];
        System.out.print("Enter the value which you want to check :\n");
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                sudoku[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println((P1_9.isValidConfig(sudoku, 9) ? "YES" : "NO"));//calls the method isValidConfig of P1_9 class file .
    }
}