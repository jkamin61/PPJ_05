package task04;

public class Main {
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
            double element = 1 / Math.pow(2, n);
            System.out.println("n = "+n+" : element - "+element);
        }
    }
}
