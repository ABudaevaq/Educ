public class Factorial {
    static int factorial(int n) {
        if(n==0) return 1;
        else return n * factorial(n-1);
    }

    static int factorialFor(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        System.out.println(fact);
        return fact;
    }

    public static void main(String[] args) {
        int factorial = factorial(4);
        int fact = factorialFor(4);
        System.out.printf("Факториал req = %s \n", factorial);
        System.out.printf("Факториал for = %s", fact);
    }

}
