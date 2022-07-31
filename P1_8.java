public class P1_8 {
    P1_8(int x,int y,String[] z,String k)
    {
        int marks[] = new int[x];
        char[] c = k.toCharArray();//gives the key to a new string
        for(int i=0;i<x;i++)//moves until que of all student be checked
        {
            marks[i]=0;
            char[] c2 = z[i].toCharArray();//gives the ans given by student to a new string
            for(int j=0;j<y;j++)
            {
                if(c2[j]==c[j])//compares the key and the ans of the student and increases the marks
                {
                    marks[i]++;
                }
            }
        }
        for(int i=0;i<x;i++)
        {
            System.out.println("Marks of Student "+(i+1)+" :"+marks[i]);
        }
    }

}