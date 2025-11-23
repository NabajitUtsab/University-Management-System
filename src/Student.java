public class Student extends Person{

    private String major;
    private int creditsCompleted;

    Student(String name, String email, String major, int creditsCompleted){
        super(name, email);

        this.major = major;
        this.creditsCompleted = creditsCompleted;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCreditsCompleted() {
        return creditsCompleted;
    }

    public void setCreditsCompleted(int creditsCompleted) {
        this.creditsCompleted = creditsCompleted;
    }


    @Override
    public String toString() {
        return "\n"+"Student details : \n" +
                "Id = " + id + "\n" +
                "Name = " + name + "\n" +
                "Email = " + email + "\n" +
                "Major = " + major + "\n" +
                "Credits Completed = " + creditsCompleted + "\n"
                ;
    }
}
