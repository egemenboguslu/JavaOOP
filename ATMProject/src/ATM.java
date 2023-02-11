import java.util.Scanner;

public class ATM {

    public void run(Hesap hesap) {

        Login login = new Login();

        Scanner input = new Scanner(System.in);

        System.out.println("Bankamıza hoş geldiniz!!!");
        System.out.println("-------------------------");
        System.out.println("Kullanıcı girişi: ");
        System.out.println("-------------------------");

        int girisHakki = 3;

        while (true) {

            if (login.login(hesap)) {
                System.out.println("Giriş başarılı.");
                break;
            } else {
                System.out.println("Giriş başarısız.");
                girisHakki -= 1;
                System.out.println("Kalan hak: " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("Giriş hakkınız bitti.");
                return;
            }
        }

        System.out.println("-------------------------");
        String islemler = "1. Bakiye Sorgulamak\n"
                + "2. Para Çekme\n"
                + "3. Para Yatırma\n"
                + "4. Çıkış";
        System.out.println(islemler);
        System.out.println("-------------------------");

        while (true) {

            System.out.print("İşlemi seçiniz: ");
            String islem = input.nextLine();

            if (islem.equals("4")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int tutar = input.nextInt();
                input.nextLine();
                hesap.paraCek(tutar);

            } else if (islem.equals("3")) {
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                int tutar = input.nextInt();
                input.nextLine();
                hesap.paraYatir(tutar);

            } else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}
