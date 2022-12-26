import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


// 1.Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
// 2.Добавить пять элементов в множество.
// 3.Отсортировать значения используя итератор.
// 4.Отсортированный результат сохранить в LinkedHashSet
// 5.Создать TreeSet с компаратором.
// 6.Скопировать содержимое первого множества (HashSet) в TreeSet.
// 7.*Скорректировать компаратор так, чтобы поля хранились в обратном порядке.

public class dz6 {
    public static void main(String[] args) {
//1. Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
        HashSet<String> flowers = new HashSet<String>();
// 2.Добавить пять элементов в множество.
        flowers.add("rose");
        flowers.add("lily");
        flowers.add("tulip");
        flowers.add("orchid");
        flowers.add("iris");
        System.out.println(flowers.toString());
// 3.Отсортировать значения используя итератор.
// 4.Отсортированный результат сохранить в LinkedHashSet
        LinkedHashSet<String> flowers1 = new LinkedHashSet<>();
        flowers1.size();

        if (!flowers.isEmpty()){
            Iterator<String> it = flowers.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
        Iterator<String> it = flowers.iterator();
        ArrayList<String> flowerArray = new ArrayList<>();
        while (it.hasNext()){
            flowerArray.add(it.next());
        }
        Collections.sort(flowerArray);
        for (int i = 0; i < flowerArray.size(); i++) {
            flowers1.add(flowerArray.get(i));
        }
        System.out.println(flowers1);
// 5.Создать TreeSet с компаратором.
// 6.Скопировать содержимое первого множества (HashSet) в TreeSet.
        TreeSet<String>TSFlowers = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                } if (o1.compareTo(o2)>0) {
                    return 1;
                } else return -1;
            }
        });;

        TSFlowers.addAll(flowers);
        System.out.println(TSFlowers);
// 7.*Скорректировать компаратор так, чтобы поля хранились в обратном порядке.
        //*Скорректировать компаратор так, чтобы поля хранились в обратном порядке.
        TreeSet<String>TSFlowers2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                } if (o1.compareTo(o2)>0) {
                    return -1;
                } else return 1;
            }
        });;

        TSFlowers2.addAll(flowers);
        System.out.println(TSFlowers2);

    }
}

