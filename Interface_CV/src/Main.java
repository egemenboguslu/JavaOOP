public class Main {

    public static void main(String[] args) {

        MyCV cv = new MyCV(false);
        cv.military_service();
        String[] skills = {"Java", "SQL", "html", "CSS", "C/C++"};
        cv.skills(skills);
        String[] education = {"KTU/Comp.Eng.", "RTEU/YL"};
        cv.educational_background(education);
        String[] internship = {"Turk Telekom", "TRT", "Phi Software"};
        cv.internship_experience(internship);
        System.out.println(cv.mobilePhone("0539333333"));

    }
}