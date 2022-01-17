import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Maine {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Alexander\\Desktop\\sds.txt");
        Scanner sc = new Scanner(file);
        int size = 0;
        List<String> list = new ArrayList<>();
        List<String> words = new ArrayList<>();
        List<String> translation = new ArrayList<>();
        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
            size++;
        }
        for (int i = 0; i < size; i++) {
            words.add(getFirstLine(list.get(i)));
            translation.add(getSecondLine(list.get(i)));
        }
    }
    public static String getFirstLine(String line) {
        String[] lines = line.split("-");
        return lines[0];
    }
    public static String getSecondLine(String line) {
        String[] lines = line.split("-");
        return lines[1];
    }
}