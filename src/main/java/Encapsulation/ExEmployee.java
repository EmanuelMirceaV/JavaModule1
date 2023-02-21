package Encapsulation;

public class ExEmployee {
    // Create Employee ID and Salary in the ExEmployee class
    // Using Encapsulation, give values to Employee ID and Salary in a different class, then print those new values

    private int employeeId;
    private int salary;

    public int getId() {
        return employeeId;
    }

    public void setId(int id) {
        this.employeeId = id;
    }

    public double getSal() {
        return salary;
    }
    public void setSal(int sal) {
        this.salary = sal;
    }
}

class Execute{

    public static void main(String[] args) {

        ExEmployee emp = new ExEmployee();

        emp.setId(45);
        emp.setSal(1500);

        System.out.println("Employee Information: " + "\nEmployee ID: " + emp.getId()
                + "\nEmployee Salary: " + emp.getSal());

    }
}
