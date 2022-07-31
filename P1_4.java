import java.util.Arrays;
public class P1_4 {
    P1_4(int a[],int b)
    {
        boolean m=false;

        for(int i=0;i<b;i++)
        {
            if(i==b-1 || i==b-2 || (i==b-3 && a[i]!=1))
            {
                m=false;//checkif that as the array is at last 3 places and not got 1 yet the give false value.
                break;
            }
            else
            {
                if(a[i] == 1)//checks if the curent element if 1 or not
                {
                    if(a[i+1] == 2)//if passes for above the checks that currrent element is 2 or not
                    {
                        if(a[i+2] == 3)//if passes for above the checks that currrent element is 3 or not if yes its true the gives value true to p.
                        {
                            m=true;//
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("array("+Arrays.toString(a)+") -->" +m);
    }

}
