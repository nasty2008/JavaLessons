/*
 * ДЗ № 1:
 * 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
 *int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

import java.util.Random;
import java.util.Arrays;

public class dz1 {

    public static void main(String[] args){
        int i = getNumber ();
        System.out.println("Случайное число = " + i); // Задание №1
        System.out.println(Integer.toBinaryString(new Random().nextInt(40)).length()); // Задание №2
        int n = new Random().nextInt(0, 128);
        System.out.printf("n = " + n + "; i = " + i + '\n');
    
        
      
        int a = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
               a++;
        }
    }
        int[] m1 = new int[a];
        a = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
               m1[a] = j;
               a += 1;
        }
    }
        System.out.println(Arrays.toString(m1) + "\n");

        
        a = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                a++;
        }
    }
        int[] m2 = new int[a];
        a = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
             if (j % n != 0) {
                 m2[a] = j;
                 a += 1;
        }
    }
        System.out.println(Arrays.toString(m2));

    }
      
    static int getNumber(){
    return new Random().nextInt(2001); 
    } 

}   


     
         

    