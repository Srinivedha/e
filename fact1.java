import java.io.*;
import java.util.*;
class fact1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int mul=1;
        for(int i=1;i<=5;i++)
        {
        mul=a*i;
        System.out.print(mul+" ");
        mul=1;
        }
    }
}
