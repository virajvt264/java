package app;
import hospital.*;
public class Program {
    public static void main(String[] args) {

        Patient p = new Patient(1, 5);
        InHousePatient ip = new InHousePatient(1, 5, 15);

        System.out.printf("Total bill for patient: %f%n", p.getBill());
        System.out.printf("Total bill for InHouse patient: %f%n", ip.getBill());
        
    }
    
}
