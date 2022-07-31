// Name :- Thumar Param
// Roll-no :-21ce144
// Aim :-The problem is to write a program that will grade multiple-choice tests. Assume
// there are eight students and ten questions, and the answers are stored in a two dimensional array. Each row records a student’s answers to the questions, as
// shown in the following array.
// Students’ Answers to the Questions:
// 0 1 2 3 4 5 6 7 8 9
// Student 0 A B A C C D E E A D
// Student 1 D B A B C A E E A D
// Student 2 E D D A C B E E A D
// Student 3 C B A E D C E E A D
// Student 4 A B D C C D E E A D
// Student 5 B B E C C D E E A D
// Student 6 B B A C C D E E A D
// Student 7 E B E C C D E E A D
// The key is stored in a one-dimensional array:
// Key to the Questions:
// 0 1 2 3 4 5 6 7 8 9
// Key D B D C C D A E A D
// Your program grades the test and displays the result. It compares each student’s
// answers with the key, counts the number of correct answers, and displays it.
// Git-hub repository:
import java.util.*;
public class P1_8Main {
    public static void main(String[] args) {
        int m,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of students :");
        m = sc.nextInt();
        System.out.print("Enter number of questions :");
        n = sc.nextInt();
        String[] a = new String[m];
        System.out.println("Enter the Answers :");
        for(int i=0;i<m;i++)
        {
            System.out.print("Student "+(i+1)+" :");
            a[i] = sc.next();
        }
        //System.out.println();
        String k;
        System.out.print("Enter the answer key :");
        k = sc.next();
        P1_8 d8 = new P1_8(m, n, a, k);//calls the constructor of the class file.
    }
}
