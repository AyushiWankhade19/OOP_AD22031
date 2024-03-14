/* Aim: (Practical.05)Create a class Emerging_Technologie forHierarchical inheritance, from a single parent
class (Emerging_Technologie),inheriting multiple child classes such as class AIML, class
AIDS, and class CSE.
   Author: Ayushi Wankhade
   Version:5.0
   Date: 27/02/2024
*/
// Parent class
class Emerging_Technologie {
    String president;
    String treasurer;
    String secretary;

    Emerging_Technologie(String president, String treasurer, String secretary) {
        this.president = president;
        this.treasurer = treasurer;
        this.secretary = secretary;
    }

    void display() {
        System.out.println("President: " + president);
        System.out.println("Treasurer: " + treasurer);
        System.out.println("Secretary: " + secretary);
    }
}

// Child class 1
class AIML extends Emerging_Technologie {
    AIML(String president, String treasurer, String secretary) {
        super(president, treasurer, secretary);
    }
}

// Child class 2
class AIDS extends Emerging_Technologie {
    AIDS(String president, String treasurer, String secretary) {
        super(president, treasurer, secretary);
    }
}

// Child class 3 (just an example)
class CSE extends Emerging_Technologie {
    CSE(String president, String treasurer, String secretary) {
        super(president, treasurer, secretary);
    }
}

public class PracticalNo5 {
    public static void main(String[] args) {
        // Creating instances for AIML and AIDS classes
        AIML aiml = new AIML("Dimpal Girde", "Sanika Chure", "Sakshi Darokar");
        AIDS aids = new AIDS("Dimpal Girde", "Ayushi Wankhade", "Pranjal Mankar");

        // Displaying details for AIML
        System.out.println("Details for AIML:");
        aiml.display();

        System.out.println(); // Just for spacing

        // Displaying details for AIDS
        System.out.println("Details for AIDS:");
        aids.display();
    }
}