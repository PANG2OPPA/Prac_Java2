package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 숫자를 입력하세요.");
            int a = scanner.nextInt();

            System.out.println("두번째 숫자를 입력하세요.");
            int b = scanner.nextInt();

            if (a == 0 && b == 0) {
                System.out.println("종료합니다.");
                break;
            }

            System.out.println(a * b);
        }
    }
}
