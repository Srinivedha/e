import java.io.*;
import java.util.*;
class Power
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        double c=Math.pow(a,b);
        
        System.out.print((int)Math.round(c));
    }
}
