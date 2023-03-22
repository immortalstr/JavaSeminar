// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
package Homework_01;
import java.util.Arrays;
import java.util.Random;

public class Zada4a_01 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2001); // выбрасываем случайное число в диапазоне от 0 до 2000 и сохраняем в i
        System.out.println("Случайное число i = " + i);
        System.out.println("------------------------------------");

        int n = Integer.toBinaryString(i).length(); // считаем номер старшего значащего бита выпавшего числа и сохраняем в n
        System.out.println("Номер старшего значащего бита n = " + n);
        System.out.println("------------------------------------");

        int[] m1 = findMultiples(n, i, Short.MAX_VALUE); // находим все кратные n числа в диапазоне от i до
                                                         // Short.MAX_VALUE и сохраняем в массив m1
        System.out.println("Кратные n числа m1 = " + Arrays.toString(m1));
        System.out.println("------------------------------------");

        int[] m2 = findNonMultiples(n, Short.MIN_VALUE, i); // находим все некратные n числа в диапазоне от
                                                            // Short.MIN_VALUE до i и сохраняем в массив m2
        System.out.println("Некратные n числа m2 = " + Arrays.toString(m2));
    }



    // метод для нахождения всех кратных n чисел в диапазоне от start до end
    public static int[] findMultiples(int n, int start, int end) {
        int[] m1 = new int[(end - start) / n + 1]; // вычисляем размер массива, который будем заполнять

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % n == 0) { // если число кратно n, добавляем его в массив
                m1[count++] = i;
            }
        }

        return Arrays.copyOf(m1, count); // возвращаем массив, урезанный до фактического количества элементов
    }

    // метод для нахождения всех некратных n чисел в диапазоне от start до end
    public static int[] findNonMultiples(int n, int start, int end) {
        int[] m2 = new int[Math.abs(Short.MIN_VALUE - start) / n + Math.abs(end - Short.MIN_VALUE) / n + 1];
                                                                                                          

        int count = 0;
        for (int i = Short.MIN_VALUE; i < start; i++) {
            if (i % n != 0) { // если число не кратно n, добавляем его в массив
                m2[count++] = i;
            }
        }

        for (int i = n; i <= end; i++) {
            if (i % n != 0) { // если число не кратно n, добавляем его в массив
                m2[count++] = i;
            }
        }

        return Arrays.copyOf(m2, count);
    }
}