public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("TZX Havalimanına Hoşgeldiniz.....");

        String conditions = "Yurt Dışı Çıkış Kuralları.......\n"
                + "Herhangi bir siyasi yasağınızın bulunmamması gerekiyor...\n"
                + "150₺ harç bedelini tam olarak yatırmanız gerekiyor...\n"
                + "Gideceğiniz ülkeye vizenizin tam olması gerekiyor....";

        String message = "Yurt dışı şartlarından hepsini sağlamanız gerekiyor... ";

        while (true) {

            System.out.println("-------------------------------------------");
            System.out.println(conditions);
            System.out.println("-------------------------------------------");

            Passenger passenger = new Passenger();

            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);

            if (passenger.yurtdisiharciKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor..");
            Thread.sleep(3000);
            if (passenger.vizeDurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi yasak durumu kontrol ediliyor..");
            Thread.sleep(3000);
            if (passenger.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("İşlemleriniz tamam..");
            break;

        }
    }
}