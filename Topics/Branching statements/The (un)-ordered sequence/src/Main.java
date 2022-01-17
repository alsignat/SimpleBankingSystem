import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOrdered = true;
        int order = 0;  // 1 for ascending, -1 for descending, 0 for unknown
        int num = scanner.nextInt();
        while (true) {
            int nextNum = scanner.nextInt();
            if (nextNum == 0) break;
            if (order == 0) {
                if (nextNum > num) order = 1;
                if (nextNum < num) order = -1;
            }
            if (order == 1 && nextNum < num || order == -1 && nextNum > num) {
                isOrdered = false;
                break;
            }
            num = nextNum;
        }
        System.out.println(isOrdered);
    }
}