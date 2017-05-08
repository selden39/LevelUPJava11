public class RecursionDemo {

    public static void main(String[] args) {
       int n = 7;
        System.out.println(factorial(n));
    }

    private static long factorial(int n){
        if (n > 0 ){
            return factorial(n-1) * n;
        } else {
            return 1;
        }
    }
}
