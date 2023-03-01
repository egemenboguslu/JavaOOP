import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        String operations = "İşlemi seçinizz...\n"
                + "1. Karenin alanı için\n"
                + "2. Dairenin alanı için\n"
                + "Çıkış için q'ya basin.";

        while (true) {

            System.out.println(operations);

            System.out.print("Hangi şeklin alanını hesaplayacaksınız: ");
            String type = input.nextLine();
            Shape shape = null;

            if (type.equals("q")) {
                System.out.println("Programdan çıkılıyor..");
                Thread.sleep(2000);
                break;
            } else if (type.equals("1")) {
                System.out.print("Karenin kenarını giriniz: ");
                int side = input.nextInt();
                input.nextLine();

                shape = new Square("Kare", side);
                shape.fieldMeasurement();

            } else if (type.equals("2")) {
                System.out.print("Dairenin yarıçapını giriniz: ");
                int radius = input.nextInt();
                input.nextLine();

                shape = new Circle("Daire1", radius);
                shape.fieldMeasurement();

            } else {
                System.out.println("Geçersiz işlem girdiniz..");
            }

        }

    }
}