public class Main{


public class Employee {

    private String name;
    private String socialSecurityNumber;
    private float wage;
    private float workingHours;


    public Employee(String name, String socialSecurityNumber, float wage, float workingHours) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.wage = wage;
        this.workingHours = workingHours;
    }


    public void displayInfo() {
        System.out.println("Name: " + name + ", Social Security Number: " + socialSecurityNumber);
    }

    public void displaySalary() {
        float salary = wage * workingHours;
        System.out.println("Salary: " + salary);
    }
	public static void main(String args[]){
	    Employee employee1 = new Employee("John Doe", "123-45-6789", 20.0f, 40.0f);


        employee1.displayInfo();
        employee1.displaySalary();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Social Security Number: ");
        String ssn = scanner.nextLine();

        System.out.print("Enter wage: ");
        float wage = scanner.nextFloat();

        System.out.print("Enter working hours: ");
        float hours = scanner.nextFloat();

        Employee employee2 = new Employee(name, ssn, wage, hours);


        employee2.displayInfo();
        employee2.displaySalary();
    }
}





	}

