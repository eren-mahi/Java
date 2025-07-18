import java.util.*;
class Blocks_Lines_Stars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of blocks:");
        int blocks = in.nextInt();
        System.out.println("Enter the no of lines:");
        int lines = in.nextInt();
        System.out.println("Enter the no of stars:");
        int stars = in.nextInt();
        int count = 0;
        for(int i=0;i<blocks;i++)
        {
            for(int j=0;j<lines-i;j++)
            {
                for(int k=0;k<stars;k++)
                {
                    System.out.print("* ");
                    count++;
                }
                System.out.println("");
            }
            System.out.println(count);
            count=0;
            System.out.println("------------");
        }
    }
}
