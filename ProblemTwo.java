public class ProblemTwo {
    public static void main(String[] args){
        
    }

    public static void ConvertedLoopA(int max){
        int n = 1;
        while(n <= max){
            System.out.println(n);
            n++;
        }
    }

    public static void ConvertedLoopB(){
        int total = 25;
        int number = 1;

        while(number <= (total/2)){
            total = total - number;
            System.out.println(total + " " + number);
        }
    }

    public static void ConvertedLoopC(){
        int i = 1;
        while(i <= 2){
            int j = 1;
            while(j <= 3){
                int k = 1;
                while(k <= 4){
                    System.out.print("*");
                    k++;
                }
                System.out.print("!");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void ConvertedLoopD(){
        int number = 4;
        int count = 1;

        while(count <= number){
            System.out.println(number);
            number = number/2;
            count++;
        }
    }
}
