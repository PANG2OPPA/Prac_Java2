package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { // 블록 내부, for 문 내
            System.out.println(m); // 블록 내부에서 외부는 접근 가능
            System.out.println(i);
        } // i 생존 종료
        System.out.println(m);
//        System.out.println(i);
    }
}
