import java.util.*;
public class P1_9 {
    public static boolean notInRow(char a[][], int b)
    {
        // store the charactor
        HashSet<Character> st = new HashSet<>();
        for(int i = 0; i < 9; i++)
        {
            // If already encountered before,
            // return false
            if (st.contains(a[b][i]))
                return false;
            // If it is not an empty cell, insert value
            // at the current cell in the set
            if (a[b][i] != '.')
                st.add(a[b][i]);
        }
        return true;
    }

    // Checks whether there is any duplicate
// in current column or not.
    public static boolean notInCol(char a[][], int c)
    {
        HashSet<Character> st = new HashSet<>();
        for(int i = 0; i < 9; i++)
        {
            // If already encountered before,
            // return false
            if (st.contains(a[i][c]))
                return false;
            // If it is not an empty cell,
            // insert value at the current
            // cell in the set
            if (a[i][c] != '.')
                st.add(a[i][c]);
        }
        return true;
    }
    // Checks whether there is any duplicate
// in current 3x3 box or not.
    public static boolean notInBox(char arr[][],int startRow,int startCol)
    {
        HashSet<Character> st = new HashSet<>();
        for(int b = 0; b < 3; b++)
        {
            for(int c = 0; c < 3; c++)
            {
                char curr = arr[b + startRow][c + startCol];
                // If already encountered before, return
                // false
                if (st.contains(curr))
                    return false;
                // If it is not an empty cell,
                // insert value at current cell in set
                if (curr != '.')
                    st.add(curr);
            }
        }
        return true;
    }

    // Checks whether current row and current column and
// current 3x3 box is valid or not
    public static boolean isValid(char a[][], int b,int c)
    {
        return notInRow(a, b) && notInCol(a, c) &&
                notInBox(a, b - b % 3, c - c % 3);
    }
    public static boolean isValidConfig(char a[][], int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                // If current row or current column or
                // current 3x3 box is not valid, return
                // false
                if (!isValid(a, i, j))
                    return false;
            }
        }
        return true;
    }

}