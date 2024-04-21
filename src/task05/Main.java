package task05;

public class Main {
    public static void main(String[] args) {
        int wrt = 1;
        for (int n = 0; n < 10; n++) {
            double element = 1 / Math.pow(2, n);
            double result = element * wrt;
            System.out.println("n = "+n+" : element - "+result);
        }
    }
}
