import java.util.Random;

public class ProblemSeven {
    public static void main(String[] args){
        System.out.println(SpecificRandomNumber());
    }

    public static int SpecificRandomNumber(){
        Random SpecificNumber = new Random();
        int SpecificInt = SpecificNumber.nextInt(25) * 2 + 51;
        return SpecificInt;

    }
}
