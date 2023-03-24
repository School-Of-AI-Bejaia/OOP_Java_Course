public class Student extends Person{

    /** FIELDS  */
    private int studentID;
    private float average;


    /** CONSTRUCTOR */
    public Student(String name, String familyName, int age, int studentID, float average){
        super(name, familyName, age);
        this.studentID = studentID;
        this.average = average;
    }


    /** GETTERS & SETTERS */
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        name = newName;
    }


    /** OTHER METHODS */
    public void study(){
        System.out.println(name + " rah ykhbch!");
    }

    @Override
    public void walk(){
        System.out.println(name + " is walking as a STUDENT!");
    }

    @Override
    public void Eat(){
        System.out.println(name + " is eating!");
    }
}
