public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Hesap hesap = new Hesap("Egemen","12345",2000);

        atm.run(hesap);
        System.out.println("Programdan çıkıldı.");

    }
}