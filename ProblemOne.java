class ProblemOne{
    public static void main(String[] args){
        LoopF();
    }
    public static void LoopA(){
        int x = 1;
        while(x < 100){
            System.out.print(x + " ");
            x += 10;
        }
    }
    public static void LoopB(){
        int max = 10;
        while(max < 10){
            System.out.println("Count down: " + max);
            max--;
        }
    }
    public static void LoopC(){
        int x = 250;
        while(x % 3 != 0){
            System.out.println(x);
        }
    }
    public static void LoopD(){
        int x = 2;
        while(x < 200){
            System.out.print(x + " ");
            x *= x;
        }
    }
    public static void LoopE(){
        String word = "a";
        while(word.length() < 10){
            word = "b" + word + "b";
        }
        System.out.println(word);
    }
    public static void LoopF(){
        int x = 100;
        while(x > 0){
            System.out.println(x/10);
            x = x/2;
        }

    }
}