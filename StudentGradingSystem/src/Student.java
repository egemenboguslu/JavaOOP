public class Student {

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3) {

        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addBulkVerbalNote(int vNote1, int vNote2, int vNote3) {

        if (vNote1 >= 0 && vNote1 <= 100) {
            this.c1.vNote = vNote1;
        }
        if (vNote2 >= 0 && vNote1 <= 100) {
            this.c2.vNote = vNote2;
        }
        if (vNote3 >= 0 && vNote3 <= 100) {
            this.c3.vNote = vNote3;
        }
    }

    void courseAvarage() {

        this.c1.avarage = (this.c1.note * (1 - this.c1.effect)) + (this.c1.vNote * this.c1.effect);
        this.c2.avarage = (this.c2.note * (1 - this.c2.effect)) + (this.c2.vNote * this.c2.effect);
        this.c3.avarage = (this.c3.note * (1 - this.c3.effect)) + (this.c3.vNote * this.c3.effect);

        System.out.println(this.c1.name + " ortalaması:" + this.c1.avarage);
        System.out.println(this.c2.name + " ortalaması:" + this.c2.avarage);
        System.out.println(this.c3.name + " ortalaması:" + this.c3.avarage);

    }

    void isPass() {
        System.out.println("=====================");
        this.avarage = (this.c1.avarage + this.c2.avarage + this.c3.avarage) / 3.0;

        if (this.avarage >= 60) {
            System.out.println("Geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("Kaldınız.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println("Ortalamanız: " + this.avarage);
    }
}
