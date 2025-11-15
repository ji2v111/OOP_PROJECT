import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Welcome to School Management System\nCreate new school");
        System.out.println("Enter the name of the school:");
        String SchoolName = user.nextLine();
        System.out.println("Enter the address of school:");
        String Address = user.nextLine();
        System.out.println("Enter the contact number of school:");
        String ContactNumber = user.nextLine();
        System.out.println("Enter the medium of study in school:");
        String MediumOfStudy = user.nextLine();



        System.out.println("Enter the the seats number of auditorium:");
        String totalSeats = user.nextLine();
        //Auditorium auditorium = new Auditorium(totalSeats);

        System.out.println("Enter the area of the playground:");
        double area = user.nextDouble();
        user.nextLine();
        Playground playground = new Playground(area);


        ArrayList<Classroom> classrooms = new ArrayList<>();
        System.out.println("Enter the number of Classrooms:");
        int NumberOfClassrooms = user.nextInt();
        user.nextLine();
        for (int i = 0 ; i < NumberOfClassrooms ; i++) {
            String ClassId = "CI" + (i + 1);
            System.out.println("Enter the name of the Classroom" + (i + 1) + ":");
            String ClassName = user.nextLine();
            System.out.println("Enter the count of student in Classroom:");
            int CountOfStudent = user.nextInt();


            System.out.println("Enter the count of bench:");
            int CountOfBenchmark = user.nextInt();
            user.nextLine();
            System.out.println("Enter the count of fan:");
            int CountOfFan = user.nextInt();
            user.nextLine();
            System.out.println("Enter the count of light:");
            int CountOfLight = user.nextInt();
            user.nextLine();

            Classroom room1 = new Classroom(ClassName,ClassId,CountOfStudent,new ClassEquipment(ClassId,CountOfBenchmark,CountOfFan,CountOfLight));
            classrooms.add(room1);
        }
        ArrayList<Lab> Labs = new ArrayList<>();
        System.out.println("Enter the number of Labs:");
        int NumberOfLabs = user.nextInt();
        user.nextLine();
        for (int i = 0 ; i < NumberOfLabs ; i++) {
            String LabId = "L" + (i + 1);
            System.out.println("Enter the name of the Lab:");
            String LabName = user.nextLine();
            System.out.println("Enter the count of Equipments in Lab:");
            int CountOfEquipments = user.nextInt();
            user.nextLine();
            System.out.println("Enter Incharge ID:");
            String InchargeID = user.nextLine();



            ArrayList<String> EquipmentIDs = new ArrayList<>();
            ArrayList<LabEquipment> labEquipmentsList = new ArrayList<>();
            for(int j = 0 ; j < CountOfEquipments ; j++){
                String EquipmentId = "E" + (j+1);
                System.out.println("Enter the name of the Equipment " + (j + 1) + ":");
                String EquipName = user.nextLine();
                System.out.println("Enter the count of equipment " + (j + 1) + ":");
                int CountOfEquipment = user.nextInt();
                System.out.println("Enter the cost of equipment " + (j + 1) + ":");
                double CostOfEquipment = user.nextDouble();
                user.nextLine();

                user.nextLine();
                EquipmentIDs.add(EquipmentId);

                labEquipmentsList.add(new LabEquipment(EquipName,CountOfEquipment, EquipmentId,CostOfEquipment ));
            }


            System.out.println("Enter the count of bench:");
            int CountOfBenchmark1 = user.nextInt();
            user.nextLine();
            System.out.println("Enter the count of fan:");
            int CountOfFan1 = user.nextInt();
            user.nextLine();
            System.out.println("Enter the count of light:");
            int CountOfLight1 = user.nextInt();
            user.nextLine();

            //ClassEquipment classEquipment1 = new ClassEquipment();
            // jhensfwnre,ngmejn



            Lab lab = new Lab(LabId,LabName,InchargeID,EquipmentIDs);
            Labs.add(lab);

        }

        ArrayList<Employee> Employees = new ArrayList<>();


    }
}
