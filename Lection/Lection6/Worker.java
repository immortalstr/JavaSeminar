package Lection6;

public class Worker {
    int id;
    int salary;
    String firsName;
    String lastName;


    @Override
    public String toString() {
        return String.format("id :%d fn: %s ls: %s s: %d",id, firsName, lastName, salary);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    } 

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
