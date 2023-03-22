import java.util.*;

public class Seminar_04 {
    static Scanner myScanner = new Scanner(System.in);
    static LinkedList<ArrayList<String>> contacts = new LinkedList<>();
    public static void main(String[] args) {
        GetData();
        System.out.println(contacts);

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


private static void GetData() {
    String command;
    System.out.println("Введите '1' для ввода новой записи \n Введите '2' для завершения работы");
    command = myScanner.nextLine();
    while (command.equals("1")) {
        contacts.add(GetRecord());
        System.out.println();
        command = myScanner.nextLine();
    }
}

}


