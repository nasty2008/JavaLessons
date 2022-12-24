
// 1.Создать словарь HashMap. Обобщение <Integer, String>.
// 2.Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
// 3.Изменить значения сделав пол большой буквой.
// 4.Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."

import java.util.HashMap;
import java.util.Set;

public class dz5 {

    public static void main(String[] args) {

// 1. Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer,String> Fio = new HashMap<>();
// 2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
        Fio.put(0, "Афанасьев Владимир Иванович 42 м");
        Fio.put(1, "Петрова Людмила Петровна 34 ж");
        Fio.put(2, "Сидоров Афанасий Семеновичч 22 м");
        Fio.put(3, "Кучумин Сергей Владимирович 38 м");
        Fio.put(4, "Ростова Юлия Владимировна 29 ж");
        System.out.println(Fio);
        changeWord(Fio);

        Fio.entrySet()
                .forEach((entry) -> System.out.println(entry.getKey() + " : " + entry.getValue()));;

// 4.Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
        Set<Integer> keys = Fio.keySet();
        System.out.println("Значение в формате фамилия + инициалы: ");
        for (Integer key: keys
        ) {
            String asd1 = Fio.get(key).split(" ")[0];
            String asd = asd1.toUpperCase().charAt(0)+asd1.toLowerCase().substring(1, asd1.length());
            asd1 = Fio.get(key).split(" ")[1].toUpperCase().charAt(0)+".";
            asd = asd+ " " + asd1;
            asd1 = Fio.get(key).split(" ")[2].toUpperCase().charAt(0)+".";
            asd = asd + asd1;
            System.out.println(asd);
        }
    }
    // 3.Изменить значения сделав пол большой буквой.
    static void changeWord(HashMap<Integer, String> Fio){
        System.out.println();
        System.out.println("Вывод списка с измененной на большую буквой пола:");

        for (Integer key: Fio.keySet()){
            String str = Fio.get(key);
            int index = str.length() - 1;
            char ch = Character.toUpperCase(str.charAt(index));
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(index, ch);
            str = sb.toString();
            Fio.put(key, str);
        }
    }

}