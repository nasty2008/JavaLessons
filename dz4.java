/*1.Написать приложение для ввода ФИО, возраста и пола пользователей. Данные хранить в разных списках.
2.Добавить методы для сортировки пользователей по возрасту полу и первой букве фамилии.
3.*Добавить возможность одновременной сортировки по двум параметрам.
4.**Добавить возможность одновременной сортировки по трём параметрам.*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class dz4 {

    static ArrayList<String> list_name = new ArrayList<>();
    static ArrayList<String> list_surname = new ArrayList<>();
    static ArrayList<String> list_patname = new ArrayList<>();
    static ArrayList<Integer> list_age = new ArrayList<>();
    static ArrayList<Boolean> list_gen = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();

    static void age() {
        int asd = linkedlist.size()-1;
        while (asd > -1) {
            int max_age = list_age.get(linkedlist.get(asd));
            int index = asd;
            for (int i = 0; i < asd; i++){
                if (max_age < list_age.get(linkedlist.get(i))) {
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;
                }
            }
            int nod = linkedlist.get(asd);
            linkedlist.set(asd, linkedlist.get(index));
            linkedlist.set(index, nod);
            asd--;
        }
        linkedlist.forEach(
                i -> System.out.println(
                        list_name.get(i)+" "+list_patname.get(i)+" "+list_surname.get(i).toUpperCase().charAt(0)+". Возраст: "+list_age.get(i)+", Пол: "+list_gen.get(i)));
    }

    static void gender() {
        for (int j = 0; j < linkedlist.size(); j++) {
            if (list_gen.get(linkedlist.get(j))) {
                int asg = linkedlist.get(j);
                linkedlist.remove(j);
                linkedlist.add(0, asg);
            }
        }
        linkedlist.forEach(j -> System.out.println(list_name.get(j)+" "+list_patname.get(j)+" "+list_surname.get(j).toUpperCase().charAt(0)+". Возраст: "+list_age.get(j)+", Пол: "+list_gen.get(j)));
    }

    static void surname() {
        Collections.sort(list_surname);
        System.out.println(list_surname);
    }

    static void putTo(String fio, int age, String gender) {
        list_age.add(age);
        String[] fio1 = fio.split(" ");
        list_name.add(fio1[1]);
        list_surname.add(fio1[0]);
        list_patname.add(fio1[2]);
        if (gender.contains("М")) {list_gen.add(true);} else {list_gen.add(false);}
        linkedlist.add(list_age.size() - 1);
        System.out.println(fio + ". Age: " + age + ", Пол: " + gender);
    }

    public static void main(String[] args) {

        System.out.println("Вывод списка:");

        putTo("Петрова Галина Ивановна", 20, "Ж");
        putTo("Иванов Петр Алексеевич", 18, "М");
        putTo("Кузьмин Степан Олегович", 43, "М");
        putTo("Антипова Ольга Степановна", 36, "Ж");
        putTo("Васильева Ирина Сергеевна", 17, "М");
        putTo("Смолина Екатерина Петровна", 24, "Ж");
        putTo("Кукушкин Семен Александрович", 44, "М");

        System.out.println();
        System.out.println("Сортировка по возрасту:");
        age();
        System.out.println();
        System.out.println("Сортировка по полу:");
        gender();
        System.out.println();
        System.out.println("Сортировка по первой букве фамилии:");
        surname();
    }
}