public class Developer extends Employee {
    private String programmingL;

    public Developer(String name, String surname, int id, String programmingL) {
        super(name, surname, id);
        this.programmingL = programmingL;
    }

    public void printEmployee() {
        super.printEmployee();
        System.out.println("Yazılımcının bildiği diller: " + this.programmingL);
    }

    public void format(String operatingSystemName) {
        System.out.println(getName() + " " + operatingSystemName + " yüklüyor..");
    }
}
