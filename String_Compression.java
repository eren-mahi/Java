import java.util.*;
class String_Compression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = in.nextLine();
        int count=1;
        String res = "";
        for(int i=0;i<str.length();i++)
        {
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1))
            count++;
            else
            {
                res = res+str.charAt(i);
                res = res + count;
                count = 1;
            }
        }
        System.out.println("Result: "+res);
    }
}
