package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println(intValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println(intValue); // -2147483648 : int 범위를 넘어감 (한바퀴를 돌았음, 시계처럼) 오버플로우
    }
}
