import java.util.*;
class Coprime_Pythagoras_Triplets {
    public static boolean coprime(int a, int b)
    {
        return gcd(a,b)==1;
    }
    
    public static int gcd(int a, int b)
    {
        while (b!=0)
        {
            int tem = b;
            b = a%b;
            a=tem;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = in.nextInt();
        int i,j,k;
        for(i=1;i<num;i++)
        {
            for(j=1;j<i;j++)
            {
                for(k=1;k<j;k++)
                {
                    if (k*k + j*j == i*i)
                    if(coprime(i,j) && coprime(j,k) && coprime(k,i))
                    System.out.println(k+" "+j+" "+i);
                }
            }
        }
    }
}
