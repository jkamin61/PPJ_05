package task08;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        char[] kierunki = {'↑', '→', '↓', '←'};
        int aktualnyKierunek = 0; // 0 - północ, 1 - wschód, 2 - południe, 3 - zachód

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print(">");
            char c = in.next().charAt(0);

            if (c == 'A' || c == 'a') {
                aktualnyKierunek = (aktualnyKierunek + 3) % 4;
                System.out.println(kierunki[aktualnyKierunek]+" North");
            } else if (c == 'D' || c == 'd') {
                aktualnyKierunek = (aktualnyKierunek + 1) % 4;
                System.out.println(kierunki[aktualnyKierunek]+" East");
            } else if (c == 'S' || c == 's') {
                aktualnyKierunek = (aktualnyKierunek + 2) % 4;
                System.out.println(kierunki[aktualnyKierunek]+" South");
            } else if (c == 'W' || c == 'w') {
                System.out.println(kierunki[aktualnyKierunek]+" West");
            } else if (c == 'Q' || c == 'q') {
                break;
            } else {
                System.out.println("Nieznana komenda!");
            }
        }
    }
}
