abstract class Student {
    String StudentID;
    String StudentName;
    String ClassId;
    int Section;
    String BusId;
    static int StudentsCount;

    Student(String studentID, String studentName, String classId, int section, String busId) {
        StudentID = studentID;
        StudentName = studentName;
        ClassId = classId;
        Section = section;
        BusId = busId;
        StudentsCount++;

    }
    void StudentDetails(){
        System.out.println("Student ID: " + this.StudentID);
        System.out.println("Student Name: " + this.StudentName);
        System.out.println("Class ID: " + this.ClassId);
        System.out.println("Section: " + this.Section);
        System.out.println("Bus ID: " + this.BusId);
    }

    void PayFees(){
        System.out.println(this.StudentName+" Paid fees");
    }

}
class PrimaryStudent extends Student {
    PrimaryStudent(String studentID, String studentName, String classId, int section, String busId) {
        super(studentID, studentName, classId, section, busId);

    }


}
class HigherSecondaryStudent extends Student {
    HigherSecondaryStudent(String studentID, String studentName, String classId, int section, String busId) {
        super(studentID, studentName, classId, section, busId);
    }

}
