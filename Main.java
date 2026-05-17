public class Main {

    public static void main(String[] args) {

        
        Person p1 = new Doctor(
                "Dr. John",
                45,
                "Cardiologist",
                80000
        );

        Person p2 = new Patient(
                "Mike",
                25,
                "Fever",
                12
        );

       
        p1.displayInfo();
        p2.displayInfo();

        p1.hospitalRules();

      
        Person.hospitalType();
        Doctor.hospitalType();
        Patient.hospitalType();
    }
}