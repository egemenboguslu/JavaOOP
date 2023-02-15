public class Prelector extends Academician {

    private String doorNumber;

    public Prelector(String fullName, String mobileNo, String email, String section, String degree, String doorNumber) {
        super(fullName, mobileNo, email, section, degree);
        this.doorNumber = doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return this.doorNumber;
    }

    public void congregation(){
        System.out.println(this.getFullName() + " senato toplantısına katıldı.");
    }

    public void quiz(){
        System.out.println(this.getFullName() + " sınav yapıyor.");
    }
}
