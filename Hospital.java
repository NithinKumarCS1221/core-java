class Hospital {
String hospitalName;
String location;
int numberOfDoctors;
int numberOfBeds;
 String chiefDoctor;
 boolean hasICU;
boolean hasPharmacy;
double consultationFee;
int establishedYear;
String hospitalType;

    static String country = "India";
    static String serviceType = "Healthcare";

    public String admitPatient(String patientName) {
        System.out.println("Patient Admitted: " + patientName);
        return patientName;
    }

    public String dischargePatient(String patientName) {
        System.out.println("Patient Discharged: " + patientName);
        return patientName;
    }

    public String assignDoctor(String doctorName) {
        System.out.println("Doctor Assigned: " + doctorName);
        return doctorName;
    }

    public double collectFee(double amount) {
        System.out.println("Fee Collected: " + amount);
        return amount;
    }

    public boolean startTreatment(boolean status) {
        System.out.println("Treatment Started: " + status);
        return status;
    }

    public boolean stopTreatment(boolean status) {
        System.out.println("Treatment Stopped: " + status);
        return status;
    }

    public int countPatients(int total) {
        System.out.println("Total Patients: " + total);
        return total;
    }

    public boolean provideMedicine(boolean status) {
        System.out.println("Medicine Provided: " + status);
        return status;
    }

    public String assignRoom(String roomNo) {
        System.out.println("Room Assigned: " + roomNo);
        return roomNo;
    }

    
    }
}