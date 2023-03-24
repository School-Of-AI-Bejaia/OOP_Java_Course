public class Main {
    public static void main(String[] args) {

        System.out.println("Number of Persons: " + Person.nbrPerson);

        //Person p1 = new Student("Elon", "Musk", 20, 1, 2);     // Cannot instantiate an abstract class
        Student s1 = new Student("Elon", "Musk", 15, 1, 3);
        System.out.println("Number of Persons: " + Person.nbrPerson);

        Student s2 = new Student("Bill", "Gates", 25, 2, 5);
        System.out.println("Number of Persons: " + Person.nbrPerson + "\n");

        s1.walk();
        System.out.println("Elon's age: " + s1.getAge());    // Up & Implicit Casting (Student => Person), no need to write: ((Person)s1).getAge()


        /** Explicit VS Implicit Casting */
        int x = 10;
        float y = 20.5f;

        // Explicit casting
        x = (int)y;

        // Implicit casting
        y = x;
    }
}