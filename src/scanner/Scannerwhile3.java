package scanner;

import java.util.Scanner;

public class Scannerwhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;

        while (true) {
            System.out.println("숫자를 입력하세요.");
            int a = scanner.nextInt();

            b += a;

            if (a == 0) {
                System.out.println(b);
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
