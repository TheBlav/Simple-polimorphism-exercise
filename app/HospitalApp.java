package app;
import Data.Doctor;
import Data.Nurse;
import app.Hospital;

public class HospitalApp {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.add(new Doctor("Adam", "Adamczykk", 2500, 2500));
        hospital.add(new Nurse("Zofia", "Adamowska", 2500, 2 ));
        hospital.add(new Nurse("Basia", "Nonmina", 2500, 100));

        System.out.println(hospital.printInfo());
    }
}
