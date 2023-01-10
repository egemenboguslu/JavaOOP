public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int vNote;
    double effect;
    double avarage;

    Course(String name,String code,String prefix,double effect,Teacher teacher){
        this.name= name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        this.effect = effect;
        this.teacher = teacher;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    void printTeacher(){
        this.teacher.printTeachers();
    }
}
