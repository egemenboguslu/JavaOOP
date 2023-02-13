public class Director extends Employee {

    private int subworkers; // Sorumlu kişi sayısı

    public Director(String name, String surname, int id, int subworkers) {
        super(name, surname, id);
        this.subworkers = subworkers;
    }

    public void printEmployee() {
        super.printEmployee();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + this.subworkers);
    }

    public void markUp(int amount) {
        System.out.println(getName() + " çalışanlara" + amount + " kadar zam yaptı.");
    }
}
