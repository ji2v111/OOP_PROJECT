public abstract class Employee {
    String EmployeeId;
    String EmployeeName;
    double Salary;
    String DepartmentId;

    Employee(String EmployeeId, String EmployeeName, double Salary, String DepartmentId) {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.Salary = Salary;
        this.DepartmentId = DepartmentId;
    }
    void EmployeeDetails(){
        System.out.println("Employee Details:");
        System.out.println("Employee Id: " + EmployeeId);
        System.out.println("Employee Name: " + EmployeeName);
        System.out.println("Employee Salary: " + Salary);
        System.out.println("Employee Department: " + DepartmentId);
    }
    void CheckIn(){
        System.out.println(this.EmployeeName + " is checking in.");
    }
    void ReceiveSalary(){
        System.out.println(this.EmployeeId+ " Received the Salary " + this.Salary);
    }
}


class Teacher extends Employee {
    Teacher(String EmployeeId, String EmployeeName, double Salary, String DepartmentId) {
        super(EmployeeId, EmployeeName, Salary, DepartmentId);
    }
}



class SupportStaff extends Employee {
    SupportStaff(String EmployeeId, String EmployeeName, double Salary, String DepartmentId) {
        super(EmployeeId, EmployeeName, Salary, DepartmentId);
    }

}