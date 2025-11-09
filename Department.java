import java.util.ArrayList;

public class Department {
    String DepartmentId;
    String DepartmentName;
    String InchargeName;
    ArrayList<Employee> MemberList;

    public Department(String DepartmentId, String DepartmentName, String InchargeName, ArrayList<Employee> MemberList) {
        this.DepartmentId = DepartmentId;
        this.DepartmentName = DepartmentName;
        this.InchargeName = InchargeName;
        this.MemberList = MemberList;
    }

    void DepartmentDetails(){
        System.out.println("Department Details");
        System.out.println("Department Id: " + DepartmentId);
        System.out.println("Department Name: " + DepartmentName);
        System.out.println("Incharge Name: " + InchargeName);
        System.out.println("Members List: ");
        for(Employee e: MemberList){
            System.out.println(e);
        }
    }



}
