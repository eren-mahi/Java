import java.util.*;
class TwoD_Prime {
    public static boolean prime(int a)
    {
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            return false;
        }
        return true;
    }
    
    public static int sumd(int n)
    {
        int num = n,rem = 0,sum = 0;
        while (num<0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        for(int i=100;i<1000;i++)
        {
            if(prime(i) && prime(sumd(i)))
            System.out.print(i+" ");
        }
    }
}
