
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Çalışanlar programına hoş geldiniz...");
        String islemler = "İşlemler...\n"
                + "1.Developer işlemleri\n"
                + "2.Director işlemleri\n"
                + "Çıkış için q'ya basın.";
        System.out.println("----------------------");
        System.out.println(islemler);
        System.out.println("-----------------------");

        while (true) {
            System.out.print("İşlemi seçiniz: ");
            String islem = input.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor..");
                break;
            } else if (islem.equals("1")) {
                Developer developer = new Developer("Egemen", "Boguslu", 10, "Java,Python");
                String developer_islem = "Developer işlemleri...\n"
                        + "1.Format At\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkış için q'ya bas.";
                System.out.println(developer_islem);

                while (true) {
                    System.out.print("Developer işlemini seçiniz: ");
                    String d_islem = input.nextLine();

                    if (d_islem.equals("q")) {
                        System.out.println("Developer işleminden çıkılıyor..");
                        break;
                    } else if (d_islem.equals("1")) {
                        System.out.print("İşletim Sistemi: ");
                        String operatingSystem = input.nextLine();
                        developer.format(operatingSystem);
                    } else if (d_islem.equals("2")) {
                        developer.printEmployee();
                    } else {
                        System.out.println("Geçersiz developer işlemi...");
                    }
                }

            } else if (islem.equals("2")) {

                Director director = new Director("Murat", "Coskun", 125, 20);
                String director_islem = "Director işlemleri...\n"
                        + "1. Zam Yapma\n"
                        + "2. Bilgileri Göster\n"
                        + "Çıkış için q'ya basın..\n";
                System.out.println(director_islem);

                while (true) {
                    System.out.print("Director işlemini seçiniz: ");
                    String directr_islem = input.nextLine();

                    if (directr_islem.equals("q")) {
                        System.out.println("Director işleminde çıkılıyor..");
                        break;
                    } else if (directr_islem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int amount = input.nextInt();
                        input.nextLine();
                        director.markUp(amount);
                    } else if (directr_islem.equals("2")) {
                        director.printEmployee();
                    } else {
                        System.out.println("Geçersiz director işlemi...");
                    }
                }

            } else {
                System.out.println("Geçersiz işlem..");
            }
        }
    }
}