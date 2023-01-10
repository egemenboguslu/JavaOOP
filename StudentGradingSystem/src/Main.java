public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("X hoca", "0452", "MATH");
        Teacher t2 = new Teacher("Graham Bell", "444", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "333", "BIO");

        Course math = new Course("Math", "101", "MATH", 0.2, t1);
        math.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK", 0.3, t2);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO", 0.4, t3);
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", math, fizik, biyo);
        s1.addBulkExamNote(100, 23, 45);
        s1.addBulkVerbalNote(100, 48, 50);
        s1.courseAvarage();
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "134", "4", math, fizik, biyo);
        s2.addBulkExamNote(100, 55, 45);
        s2.addBulkVerbalNote(45, 32, 78);
        s2.courseAvarage();
        s2.isPass();

        Student s3 = new Student("DamatFerit", "454", "4", math, fizik, biyo);
        s3.addBulkExamNote(100, 35, 46);
        s3.addBulkVerbalNote(98, 76, 34);
        s3.courseAvarage();
        s3.isPass();

    }
}