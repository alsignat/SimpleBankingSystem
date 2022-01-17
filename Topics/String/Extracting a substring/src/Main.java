import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int first = scanner.nextInt();
        int last = scanner.nextInt();
        String strNew = str.substring(first, last+1);
        System.out.println(strNew);
    }
}