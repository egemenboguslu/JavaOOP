public class Teacher {

    String name;
    String mobileNo;
    String branch;

    Teacher(String name, String mobileNo, String branch) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.branch = branch;
    }

    void printTeachers(){
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " + this.mobileNo);
        System.out.println("Bölümü: " + this.branch);
    }


}
