import java.io.*;
import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a==2||a==3)
        {
            System.out.print("yes");
        }
       else if(a>3&&a<=1000)
        {
            if(a%2==0||a%3==0)
            {
                System.out.print("no");
            }
            else
            System.out.print("yes");
        }
        else
        System.out.print("no");
    }
}
