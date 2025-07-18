import java.util.*;
class Coins_Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amt = in.nextInt();
        int[] coins = {500,200,100,50,20,10,5,2,1};
        for(int i: coins)
        {
            while(amt>=i)
            {
                System.out.print(i+" ");
                amt = amt-i;
            }
        }
    }
}
