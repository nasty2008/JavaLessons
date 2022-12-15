/*4.Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
  5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
  6.*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().*/
public class taskFourFiveSix {
    public static void main(String[] args) {
        int a = 3; int b = 56;
        System.out.println("4. "+NumberToString(a, b));
        System.out.println("5. "+ReplaceTheSymbol(a, b));
        System.out.println("6. "+ReplaceTheSymbol2(a, b));

    }

    static String NumberToString(int a,int b){
        StringBuilder num = new StringBuilder();
        num.append(a).append(" + ").append(b+" = ").append(a+b+"\n");
        num.append("   "+a).append(" - ").append(b+" = ").append(a-b+"\n");
        num.append("   "+a).append(" * ").append(b+" = ").append(a*b+"\n");
        return num.toString();
    }

    static String ReplaceTheSymbol(int a,int b){
        StringBuilder num = new StringBuilder();
        num.append(a).append(" + ").append(b+" = ").append(a+b+"\n");
        num.deleteCharAt(7);
        num.insert(7, " равно ");
        return num.toString();
    }

    static String ReplaceTheSymbol2(int a,int b){
        StringBuilder num = new StringBuilder();
        num.append(a).append(" - ").append(b+" = ").append(a-b+"\n");
        num.replace(7, 8, "равно");
        return num.toString();
    }

}