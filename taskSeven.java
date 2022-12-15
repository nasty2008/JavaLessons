/*7.Сравнить время выполнения пункта 6 со строкой содержащей 10000 символов "=" средствами String  и StringBuilder.
 */
public class taskSeven {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            str.append("=");
        }
        System.out.println(str);

        int pos;
        long startTime = System.currentTimeMillis();
        while ((pos = str.indexOf("=")) != -1) {
            str.replace(pos, pos + 1, "равно");
        }
        long endTime = System.currentTimeMillis();

        System.out.println(str);
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }
}
