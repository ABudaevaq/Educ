public class Febanacci {
    static public int getValueReq(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getValueReq(n - 1) + getValueReq(n - 2);
        }
    }

    static int getValueFor(int n) {
        int fibanacci = 1;
        int end = 1;
        if (n < 2) return n;
        for (int i = 2; i < n; i++) {
            int so = fibanacci + end;
            fibanacci = so;
            end = fibanacci;
        }
        return fibanacci;
    }

    public static void main(String[] args) {
        Febanacci fReq = new Febanacci();
        System.out.printf("рекурсия - %s \n", fReq.getValueReq(5));
        System.out.printf("цикл - %s ", fReq.getValueFor(5));
    }

}
