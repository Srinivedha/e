import java.io.*;
import java.util.*;
class Palini
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a;
        int rev=0;
        while(a!=0)
        {
            int rem=a%10;
            rev=rev*10+rem;
             a=a/10;
        }
        
        if(b==rev)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
