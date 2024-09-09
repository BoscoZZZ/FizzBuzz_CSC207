public class Reduce {
    public static void main(String[] args) {
        int result = 0;
        for(int i = 100; i > -1; i--){
            if (i % 2 == 0) {
                i = i / 2;
                System.out.println(i);
                result++;
            }else{
                i = i - 1;
                System.out.println(i);
                result++;
            }
        }
        System.out.println(result);

    }
}
