public class RecrusiveFibonacci {

    public static void main(String[] args) {

        int n = 5; //0 1 1 2 3 5

        int value = fibonacciUsingRecrusion(n);
        System.out.println("fibo value: "+value);
    }

    private static int fibonacciUsingRecrusion(int n) {

        if(n<=1){
            return n;
        } else {
            return fibonacciUsingRecrusion(n-1) + fibonacciUsingRecrusion(n-2);
        }
    }
}
