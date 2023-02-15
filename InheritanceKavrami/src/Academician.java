public class Academician extends Employee {

    private String section;
    private String degree;

    public Academician(String fullName, String mobileNo, String email, String section, String degree) {
        super(fullName, mobileNo, email);
        this.section = section;
        this.degree = degree;
    }

    public void setSection(String section){
        this.section = section;
    }

    public void setDegree(String degree){
        this.degree = degree;
    }

    public String getSection(){
        return this.section;
    }

    public String getDegree(){
        return this.degree;
    }

    public void attendClass(){
        System.out.println(this.getFullName() + " derse giriş yaptı.");
    }


}
