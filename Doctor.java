public class Doctor extends Person {

    private String specialization;
    private final double salary;

    
    public Doctor(String name, int age,
                  String specialization,
                  double salary) {

        super(name, age); 
        this.specialization = specialization;
        this.salary = salary;
    }

   
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

  
    @Override
    public void displayInfo() {
        System.out.println("Doctor Information:");
        super.displayInfo(); 
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: $" + salary);
    }

    // Method Hiding
    public static void hospitalType() {
        System.out.println("Specialized Hospital");
    }
}