public class MyCV implements IResume {

    private boolean soldiery;

    public MyCV(boolean soldiery) {
        this.soldiery = soldiery;
    }

    @Override
    public void skills(String[] arr) {
        System.out.println("Kullandığım diller..");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public void military_service() {
        if (soldiery) {
            System.out.println("Askerlik yapıldı.");
        } else {
            System.out.println("Bedelli yapılacak.");
        }
    }

    @Override
    public void educational_background(String[] array) {
        System.out.println("Eğitim durumum...");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Override
    public String mobilePhone(String mpno) {
        return "Telefon no: " + mpno;
    }

    @Override
    public void internship_experience(String[] arr) {
        System.out.println("Staj deneyimlerim..");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
