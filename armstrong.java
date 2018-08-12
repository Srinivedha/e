import java.io.*;
import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int number=a+1;number<b;++number)
        {
            int digit=0;
            int result=0;
            int or_num=number;
            while(or_num!=0)
            {
                or_num/=10;
                ++digit;
            }
            or_num=number;
            while(or_num!=0)
            {
                int rem=or_num%10;
                result+=Math.pow(rem,digit);
                or_num/=10;
            }
            if(result==number)
            System.out.print(number+" ");
        }
        
    }
}
