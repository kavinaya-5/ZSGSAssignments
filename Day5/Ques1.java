/*1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.*/
abstract class MedicalRecord{
    int recordId;
    String patientName;
    String dateOfVisit;
    String diagonosis;
    void inputRecordDetails(int recordId,String patientName,String dateOfVisit,String diagonosis)
    {
        this.recordId=recordId;
        this.patientName=patientName;
        this.dateOfVisit=dateOfVisit;
        this.diagonosis=diagonosis;
    }
    abstract void displayRecord();
}
class InPatientRecord extends MedicalRecord{
    int roomNumber;
    int numberOfDaysAdmitted;
    int roomCharges;
    int amount=0;
    InPatientRecord(int roomNumber,int numberOfDaysAdmitted,int roomCharges)
    {
        this.roomNumber=roomNumber;
        this.numberOfDaysAdmitted=numberOfDaysAdmitted;
        this.roomCharges=roomCharges;
    }
    public  void calculateTotalCharges()
    {
        amount=numberOfDaysAdmitted*roomCharges;
    }
    void displayRecord()
    {
        System.out.println("Id of the patient is: "+recordId);
        System.out.println("Name of the patient is: "+patientName);
        System.out.println("Date of visiting the patient is : "+dateOfVisit);
        System.out.println("Diagonosis of the patient is: "+diagonosis);
        System.out.println("Roomnumber of the patient is :"+roomNumber);
        System.out.println("Number of days admitted in the hostel is: "+numberOfDaysAdmitted);
        System.out.println("Room charges is: "+roomCharges);
        System.out.println("Total charges for admitting in the hospital is: "+this.amount);
    }
}
class OutPatientRecord extends MedicalRecord{
    String doctorName;
    int consultationFee;
    OutPatientRecord(String doctorName,int consultationFee)
    {
        this.doctorName=doctorName;
        this.consultationFee=consultationFee;
    }
    void displayRecord(){
        System.out.println("Id of the patient is: "+recordId);
        System.out.println("Name of the patient is: "+patientName);
        System.out.println("Date of visiting the patient is : "+dateOfVisit);
        System.out.println("Diagonosis of the patient is: "+diagonosis);
        System.out.println("Doctor Name is: "+doctorName);
        System.out.println("Consultation fee for the doctor is: "+consultationFee);
    }
}
public class Ques1
{
    public static void main(String[] args) {
        InPatientRecord inpatient=new InPatientRecord(4,5,900);
        inpatient.inputRecordDetails(344,"Babu","23/09/2024","Cancer");
        inpatient.calculateTotalCharges();
        inpatient.displayRecord();
        MedicalRecord outpatient=new OutPatientRecord("Prabhas",80000);
        outpatient.inputRecordDetails(544,"Sethu","8/07/1999","Fever");
        outpatient.displayRecord();
    }
}
