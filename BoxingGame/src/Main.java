public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike",10,80,90,40);
        Fighter f2 = new Fighter("John",20,70,100,30);

        Match match = new Match(f1,f2,50,100);
        match.start();

    }
}