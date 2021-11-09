public class ProblemTen {
    public static void main(String[] args){
        System.out.println(Zeroes(5850500));
    }

    public static int Zeroes(int a){
        int b = 0;
        do{
            if (a % 10 == 0) {
                b++;
            }
            a = a / 10;
        } while(a > 0);
        return b;
    }
}
