//1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        substringSearch(getData());
    }

    public static String[] getData() {
        Scanner scanner = new Scanner(System.in);
        String[] result = new String[2];

        System.out.print("Введите первую строку: ");
        result[0] = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        result[1] = scanner.nextLine();
        scanner.close();

        return result;
    }

    public static void substringSearch(String[] data) {
        String str = data[0];
        StringBuilder sb = new StringBuilder(data[1]);

        if (str.contains(sb) || str.contains(sb.reverse())) System.out.println("Вторая строка содержится в первой строке.");
        else System.out.println("Вторая строка не содержится в первой строке.");
    }

}

