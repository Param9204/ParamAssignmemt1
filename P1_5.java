
import java.util.Scanner;
import static java.lang.Math.min;

public class P1_5 {

    static int stringMatch(String p,String q)
    {
        // Figure which string is shorter.
        int count=0;
        int f=min(p.length(),q.length());
        // Look at both substrings starting at i
        for(int i=0;i<f-1;i++)
        {
            String a=p.substring(i,i+2);// taking substrings of both strings.
            String b=q.substring(i,i+2);
            if(a.equals(b))// Use .equals() with strings
            {
                count++;
            }
        }
        return count;
    }
}