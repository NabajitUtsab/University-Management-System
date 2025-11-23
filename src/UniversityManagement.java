import java.util.ArrayList;

public class UniversityManagement {

    public static void main(String[] args) {

        ArrayList<Person> person = new ArrayList<>();

        Student student1 = new Student("Abul Kalam" , "abulkalam@gmail.com","Computer Science", 60);
        Student student2 = new Student("Abdul Jabbar" , "CoolDudeAbdul@gmail.com","History", 30);

        Faculty faculty1 = new Faculty("Sohel Khan","sohailkhan@yahoo.com" ,"Math",75000);

        person.add(student1);
        person.add(student2);
        person.add(faculty1);


        for (Person eachPerson : person) {

            System.out.println("ID : "+ eachPerson.getId() + " Name : " + eachPerson.getName());

            if(eachPerson instanceof Student) {

                System.out.println(eachPerson.toString());

            }else if(eachPerson instanceof Faculty) {

              ((Faculty) eachPerson).assignCourse("Object-Oriented Design");

            }
        }


    }
}
