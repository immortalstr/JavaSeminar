package Homework_04;
import java.util.*;

public class Zada4a_04 {
    static Scanner myScanner = new Scanner(System.in);
    static LinkedList<ArrayList<String>> contacts = new LinkedList<>();

    public static void main(String[] args) {
       
        Comparator<ArrayList<String>> cmpr = new Comparator<ArrayList<String>>() {

            public int compare(ArrayList<String> t1, ArrayList<String> t2) {
                if (Integer.parseInt(t1.get(3)) > Integer.parseInt(t2.get(3)))
                    return 1;
                else if (Integer.parseInt(t1.get(3)) < Integer.parseInt(t2.get(3)))
                    return -1;
                else
                    return 0;
            }
        };
        
        Comparator<ArrayList<String>> cmprMale = new Comparator<ArrayList<String>>() {

            public int compare(ArrayList<String> t1, ArrayList<String> t2) {
                if (t1.get(4).charAt(0) > t2.get(4).charAt(0))
                    return 1;
                else if (t1.get(4).charAt(0) < t2.get(4).charAt(0))
                    return -1;
                else
                    return 0;
            }
        };
        
        GetData();
        contacts.sort(cmprMale);
        System.out.println("сортировка по полу:");
        Print();
        contacts.sort(cmpr);
        System.out.println("сортировка по возрасту:");
        Print();
    }

    private static ArrayList<String> GetRecord() {

        ArrayList<String> newRecord = new ArrayList<>();
        System.out.println("Введите Фамилию");
        String lastname = myScanner.nextLine();
        newRecord.add(lastname);
        System.out.println("Введите Имя");
        String firstname = myScanner.nextLine();
        newRecord.add(firstname);
        System.out.println("Введите Отчество");
        String middlename = myScanner.nextLine();
        newRecord.add(middlename);
        System.out.println("Введите Год Рождения");
        String age = myScanner.nextLine();
        newRecord.add(age);
        System.out.println("Введите Пол");
        String gender = myScanner.nextLine();
        newRecord.add(gender);

        return newRecord;

    }

    private static void Print() {

        for (ArrayList<String> record : contacts) {
            System.out.print(record.get(0) + " ");
            System.out.print(record.get(1).toUpperCase().charAt(0) + " .");
            System.out.print(record.get(2).toUpperCase().charAt(0) + ". ");
            System.out.print(record.get(3) + " ");
            System.out.println(record.get(4));
        }
    }

    private static void GetData() {
        String command;
        System.out.println("Введите '1' для ввода новой записи \n Введите '2' для завершения работы");
        command = myScanner.nextLine();
        while (command.equals("1")) {
            contacts.add(GetRecord());
            System.out.println("Введите '1' для ввода новой записи \n Введите '2' для завершения работы");
            command = myScanner.nextLine();
        }
    }

}