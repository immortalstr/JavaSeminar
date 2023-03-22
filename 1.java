public class 1 {
    
}
String command;
System.out.println("Введите '1' для ввода новой записи \n Введите 'q' для завершения работы \n Введите '2' для сортировки по полу \n Введите '3' для сортировки по возрасту");
command = myScanner.nextLine();
while (!command.equals("q")) {
    
    if (command.equals("1")){
        contacts.add(GetRecord());
    }
    else if (command.equals("2")){
        contacts.sort(cmprMale);
        Print();
    else if (command.equals("3")){
        contacts.sort(cmpr);
        Print();
    System.out.println("Введите '1' для ввода новой записи \n Введите '2' для завершения работы");
    command = myScanner.nextLine();