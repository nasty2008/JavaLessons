import java.util.*;
import java.util.ArrayList;

/*1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.
2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
3.Вставить элемент в список в первой позиции.
4.Извлечь элемент (по указанному индексу) из заданного списка.
5.Обновить определенный элемент списка по заданному индексу.
6.Удалить третий элемент из списка.
7.Поиска элемента в списке по строке.
8.Создать новый список и добавить в него несколько елементов первого списка.
9.Удалить из первого списка все элементы отсутствующие во втором списке.
10.*Сортировка списка.
11*Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.*/


public class dz3 {

    public static void main(String[] args) {

        //1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> list_one = new ArrayList<String>();
        list_one.add("Apple");
        list_one.add("Orange");
        list_one.add("Banana");
        list_one.add("Apricot");
        list_one.add("Kiwi");
        System.out.println("Задание 1: " + list_one);

        //2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        String[] colors_array = new String[]{"black", "red", "blue", "white"};
        ArrayList<String> colors_list = new ArrayList<String>();

        for (int i = 0; i < colors_array.length; i++) {
            colors_list.add(colors_array[i] + "!");
        }
        System.out.println("Задание 2: ");
        for (String element : colors_list) {
            System.out.println(element);
        }

        //3.Вставить элемент в список в первой позиции.
        list_one.add(0, "Mango");
        System.out.println("Задание 3: " + list_one);

        //4.Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("Задание 4: " + list_one.get(2) );

        //5.Обновить определенный элемент списка по заданному индексу.
        list_one.set(2, "Lemon");
        System.out.println("Задание 5: " + list_one);

        //6.Удалить третий элемент из списка.
        list_one.remove(2);
        System.out.println("Задание 6: " + list_one);

        //7.Поиска элемента в списке по строке.
        System.out.println("Задание 7: ");
        int index = list_one.indexOf("Kiwi");
        if (index == -1)
            System.out.println("Элемент не найден");
        else System.out.println("Элемент \"Kiwi\" найден на позиции " + index);

        //8.Создать новый список и добавить в него несколько элементов первого списка.
        ArrayList<String> list_two = new ArrayList<>(list_one.subList(0, 3));
        System.out.println("Задание 8: ");
        System.out.println("Новый список :");

        for (String element : list_two) {
            System.out.println(element);
        }

        //9.Удалить из первого списка все элементы отсутствующие во втором списке.
        list_one.retainAll(list_two);
        System.out.println("Задание 9: " + list_one );
        //listone.forEach(i -> System.out.println(i));

        //10.*Сортировка списка.
        System.out.println("Задание 10: ");
        Collections.sort(list_two);
        System.out.println(list_two);

        //11*Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        System.out.println("Задание 11: ");
        ArrayList<Integer> list_three = new ArrayList<Integer>();
        for (int i = 0; i < 10_000_000; i++) {
            list_three.add(i, 3);
        }
        LinkedList<Integer> list_four = new LinkedList<Integer>();
        for (int i = 0; i < 10_000_000; i++){
            list_four.add(i, 5);
        }
        long start = System.currentTimeMillis();
        list_three.add(0, 10);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        list_four.add(0, 10);
        System.out.println(System.currentTimeMillis() - start);
    }
}



