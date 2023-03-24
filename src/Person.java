public abstract class Person {

    // FIELDS
    protected String name;
    private String familyName;
    private int age;
    public static int nbrPerson =0;

    // CONSTRUCTOR
    public Person( String name, String familyName, int age){
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        nbrPerson++;
    }

    // GETTERS & SETTERS
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // OTHER METHODS
    public void walk(){
        System.out.println(name + " is walking as a normal PERSON!");
    }

    public abstract void Eat();
}
