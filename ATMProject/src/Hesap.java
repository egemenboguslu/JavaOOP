public class Hesap {

    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getKullaniciAdi() {
        return this.kullaniciAdi;
    }

    public String getParola() {
        return this.parola;
    }

    public int getBakiye() {
        return this.bakiye;
    }

    public void paraYatir(int tutar){

        this.bakiye += tutar;
        System.out.println("Yeni bakiyeniz: " + this.bakiye);
    }

    public void paraCek(int tutar){

        if(this.bakiye < tutar){
            System.out.println("Yetersiz bakiye.");
        }
        else{
            this.bakiye -= tutar;
            System.out.println("Kalan tutar: " + this.bakiye);
        }

    }

}
