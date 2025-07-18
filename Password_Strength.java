import java.util.*;
class Password_Strength {
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        System.out.println("Enter Password");
        String pd = pass.nextLine();
        if(pd.length()>7)
        {
            int sm = 0;
            int up = 0;
            int dg = 0;
            int sp = 0;
            for(int i=0;i<pd.length();i++)
            {
                char ch = pd.charAt(i);
                if(Character.isUpperCase(ch))
                up++;
                else if(Character.isLowerCase(ch))
                sm++;
                else if(Character.isDigit(ch))
                dg++;
                else
                sp++;
            }
            if(sm>0 && up>0 && dg>0 && sp>0)
            System.out.println("Good Password");
            else
            System.out.println("Bad Password");
        }
        else
        System.out.println("Insuffient Length");
       
    }
}
