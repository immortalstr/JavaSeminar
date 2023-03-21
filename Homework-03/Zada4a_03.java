import java.util.*;

public class Zada4a_03 {
    public static void main(String[] args) {
//        1. Реализовать алгоритм сортировки списков компаратором
        System.out.println("1.");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(new Random().nextInt(5));
        }
        System.out.println(list1);
        list1.sort(new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1) {
                return t1 - t0;
            }
        });
        System.out.println(list1);

//        2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        System.out.println("2.");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(new Random().nextInt(5));
        }
        System.out.println(list2);
        deleteEvenNumbers(list2);
        System.out.println(list2);

//        3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        System.out.println("3.");
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list3.add(new Random().nextInt(5));
        }
        System.out.println(list3);
        int min = Collections.min(list3);
        int max = Collections.max(list3);
        double mean = sumElements(list3) / list3.size();
        System.out.println("min = " + min + " max = " + max + " mean = " + mean);

//        4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        System.out.println("4.");
        ArrayList<Integer> list4_1 = new ArrayList<>();
        ArrayList<Integer> list4_2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4_1.add(new Random().nextInt(5));
            list4_2.add(new Random().nextInt(5));
        }
        System.out.println("Первый список: " + list4_1);
        System.out.println("Второй список: " + list4_2);

        ArrayList<Integer> list4 = setOfLists(list4_1, list4_2);
        System.out.println("Объединённый список: " + list4);

//        5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        System.out.println("5.");
        long begin = System.currentTimeMillis();
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list5.add(0, 0);
        }
        long arrayListTime = System.currentTimeMillis() - begin;
        System.out.println(list5);

//        6. Повторить пятый пункт но с LinkedList.
        System.out.println("6.");
        begin = System.currentTimeMillis();
        LinkedList<Integer> list6 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list6.addFirst(0);
        }
        long linkedListTime = System.currentTimeMillis() - begin;
        System.out.println(list6);
//        7. Сравнить время работы пятого и шестого пунктов.
        System.out.println("7.");
        System.out.println("Время работы пятого пункта = " + arrayListTime);
        System.out.println("Время работы шестого пункта = " + linkedListTime);
    }

    public static void deleteEvenNumbers(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i--);
            }
            i++;
        }
    }

    public static double sumElements(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

    public static ArrayList<Integer> setOfLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1);
        for (Integer integer : list2) {
            if (!list1.contains(integer)) {
                result.add(integer);
            }
        }
        return result;
    }
}