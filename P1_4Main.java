// Name :- Param Thumar
// Roll-no :-21ce144
//  Aim :-Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the
// array somewhere.
// array123([1, 1, 2, 3, 1]) → true
// array123([1, 1, 2, 4, 1]) → false
// array123([1, 1, 2, 1, 2, 3]) → true
// Git-hub repository:
import java.util.*;
 public class P1_4Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no of elements you want to be in array :");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the array :");
        for(int i=0;i<a;i++)
        {
            arr[i] = sc.nextInt();
        }
        P1_4 d4 = new P1_4(arr,a);//calls constructor of class file
        sc.close();
    }
}