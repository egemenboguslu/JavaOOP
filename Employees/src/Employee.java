public class Employee {

    private String name;
    private String surname;
    private int id;

    public Employee(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public void printEmployee() {
        System.out.println("Çalışanların bilgileri..");
        System.out.println("Çalışanın adı: " + name);
        System.out.println("Çalışanın soyadı: " + surname);
        System.out.println("Çalışan id no: " + id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int id() {
        return this.id;
    }
}
