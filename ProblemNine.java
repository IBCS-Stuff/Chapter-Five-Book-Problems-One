import java.util.Scanner;

public class ProblemNine {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Looper(a);
    }

    public static void Looper(Scanner x){
        String y = x.nextLine();
        do{
            System.out.println("She sells seashells by the seashore");
            System.out.println("Do you want to hear it again?");
            y = x.nextLine();
        } while(y.equals("y"));
    }
}
