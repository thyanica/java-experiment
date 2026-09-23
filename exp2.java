abstract class Employee {

    static String company = "Tech Solutions";

    public String department;
    private double salary;
    protected String designation;
    String location;

    Employee(String department, double salary, String designation, String location) {
        this.department = department;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract void displayRole();

    void displayDetails() {
        System.out.println("Company: " + company);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Location: " + location);
    }
}

class Developer extends Employee {

    Developer(String department, double salary, String designation, String location) {
        super(department, salary, designation, location);
    }

    void displayRole() {
        System.out.println("Role: Software Developer");
    }
}

class exp2 {
    public static void main(String[] args) {

        Developer emp = new Developer(
            "IT",
            50000,
            "Junior Developer",
            "Chennai"
        );

        emp.displayDetails();
        emp.displayRole();

        System.out.println("Salary using getter: " + emp.getSalary());

        emp.setSalary(55000);

        System.out.println("Updated Salary: " + emp.getSalary());
    }
}