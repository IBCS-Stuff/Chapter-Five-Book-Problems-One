import java.util.Random;

public class ProblemFour {
    public static void main(String[] args){
        mystery(19);
        mystery(42);
        mystery(48);
        mystery(40);
        mystery(64);
        Random rand = new Random();
        int a = rand.nextInt(100);
    }

    public static void mystery(int x){
        int y = 0;
        while(x % 2 == 0){
            y++;
            x = x/2;
        }
        System.out.println(x + " " + y);
    }
}
