public class Patient extends Person {

    private final  String disease;
    private final int roomNumber;

    // Constructor
    public Patient(String name, int age,
                   String disease,
                   int roomNumber) {

        super(name, age);
        this.disease = disease;
        this.roomNumber = roomNumber;
    }

   
    @Override
    public void displayInfo() {
        System.out.println("\nPatient Information:");
        super.displayInfo();
        System.out.println("Disease: " + disease);
        System.out.println("Room Number: " + roomNumber);
    }

   
    public static void hospitalType() {
        System.out.println("Patient Care Hospital");
    }
}