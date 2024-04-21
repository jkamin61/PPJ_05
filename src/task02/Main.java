package task02;

public class Main {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s += i;
        }
        //While refactor
        int s2 = 0;
        int i = 0;
        while (i < 10) {
            i++;
            s2 = s2 + i;
        }
    }
}
