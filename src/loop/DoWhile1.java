package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        // 조건에 맞지 않아도 최초 한번은 무조건 실행
        do {
            System.out.println("현재 숫자: " + i);
            i++;
        }
        while (i < 3);
        }
    }

