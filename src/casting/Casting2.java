package casting;

public class Casting2 {

    // 명시적 형변환
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int)doubleValue; // 형변환

        System.out.println(intValue);

        System.out.println((int)10.5);

        System.out.println(doubleValue);
    }
}
