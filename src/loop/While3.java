package loop;

public class While3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 500;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}