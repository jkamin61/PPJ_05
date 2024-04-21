package task01;

public class Main {
    public static void main(String[] args) {
        int K = 987654321;
        String s = "";
        while (K != 0) {
            int cyfra = K % 10;
            s = s + cyfra;
            K = K / 10;
        }
        System.out.println("S = " + s+"\nK = "+K);
    }
}
