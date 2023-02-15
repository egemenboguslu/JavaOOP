public class Officer extends Employee {

    public String department;
    public String shift;

    public Officer(String fullName, String mobileNo, String email, String department, String shift) {
        super(fullName, mobileNo, email);
        this.department = department;
        this.shift = shift;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getShift() {
        return this.shift;
    }

    public void work() {
        System.out.println(this.getFullName() + " memur görevlerini yapıyor.");
    }
}
