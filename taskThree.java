//3.Напишите программу, чтобы перевернуть строку с помощью рекурсии.
public class taskThree {

    public static void main(String[] args)
    {
        String str = "Привет";
        System.out.println("Введенная строка: " + str);
        String rev = reverseString(str);
        System.out.println("Строка после использования рекурсии: " + rev);
    }
    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}