import java.util.Scanner;

public class Passenger implements Abroad {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Passenger() {

        Scanner input = new Scanner(System.in);
        System.out.print("Yatırdığınız Harç Bedeli: ");
        this.harc = input.nextInt();
        input.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu ? (evet ya da hayır): ");
        String result = input.nextLine();

        if (result.equals("evet")) {
            this.siyasiYasak = true;
        } else {
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayır): ");
        String result2 = input.nextLine();

        if (result2.equals("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;
        }
    }

    @Override
    public boolean yurtdisiharciKontrol() {
        if (this.harc < 150) {
            System.out.println("Yurt dışı harç tutarını eksik yatırdınız.");
            return false;
        } else {
            System.out.println("Yurt dışı çıkış harç ücreti tamam.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Yurt dışına çıkıç izniniz bulunmuyor.");
            return false;
        } else {
            System.out.println("Yurt dışına çıkış yapabilirsiniz.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam.");
            return true;
        } else {
            System.out.println("Vizeniz eksik yurt dışına çıkamazsınız.");
            return false;
        }

    }
}
