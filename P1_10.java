import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class P1_10
{
    static  void cc(String a1)
    {
        char b1;
        String str = "";
        for(int i=0;i<a1.length();++i)
        {
            b1=a1.charAt(i);
            if(b1>='a' && b1<='z')//checks if the current char in the entered string is in uppercase or not.
            {
                b1=(char)(b1+3);
                if(b1>'z')
                {
                    b1=(char)(b1-'z'+'a'-1);
                }
                str+=b1;
            }
            else if(b1>='A' && b1<='Z') { //it increases ascii value by s number so the char change
                b1 = (char) (b1 + 3);
                if (b1 > 'Z') {
                    b1 = (char) (b1 - 'z' + 'a' - 1);
                }
                str += b1;
            }
            else
            {
                str+=b1;
            }
        }
        System.out.println(str);
    }
}

