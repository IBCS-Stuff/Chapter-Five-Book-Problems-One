import java.util.Random;

public class ProblemSix {
    public static void main(String[] args){
        System.out.println(Randomizer());
    }

    public static int Randomizer(){
        Random Number = new Random();
        int val = Number.nextInt(11);
        return val;
    }
}
