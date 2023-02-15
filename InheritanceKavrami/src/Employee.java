public class Employee { // Super Class

    private String fullName;
    private String mobileNo;
    private String email;

    public Employee(String fullName, String mobileNo, String email) {
        this.fullName = fullName;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public String getEmail() {
        return this.email;
    }

    public void input() {
        System.out.println(this.getFullName() + " üniversiteye giriş yaptı.");
    }

    public void output() {
        System.out.println(this.getFullName() + " üniversiteden çıkış yaptı.");
    }

    public void cafeteria() {
        System.out.println(this.getFullName() + " yemekhaneye girdi.");
    }

}
