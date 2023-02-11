import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap) { //Obje gönderdik.

        Scanner input = new Scanner(System.in);

        String kullaniciAdi;
        String parola;

        System.out.print("Kullanıcı adı: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Parola: ");
        parola = input.nextLine();

        if (hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }

    }
}
