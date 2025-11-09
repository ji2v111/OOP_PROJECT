import java.util.ArrayList;
public class Lab {
    String LabId;
    String LabName;
    String InchargeId;

    String EquipmentId;
    ArrayList<String> EquipmentIds;

    Lab(String LabId, String LabName, String InchargeId, ArrayList<String> EquipmentIds ) {

        this.LabId = LabId;
        this.LabName = LabName;
        this.InchargeId = InchargeId;
        this.EquipmentIds = EquipmentIds;
    }
}
