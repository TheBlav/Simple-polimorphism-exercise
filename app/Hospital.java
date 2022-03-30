package app;
import Data.Doctor;
import Data.Nurse;
import Data.Person;

import java.util.Scanner;

class Hospital {
    private static final int MAX_EMPLOYEES = 3;
 private Person[] employees = new Person[MAX_EMPLOYEES];
 private int employeesNumber = 0;

 void add(Person person){           //w metodzie add dodajemy obiekt typu person, ponieważ zarówno Doctor jak i Nurse dziedziczą po klasie Person
     if (employeesNumber<MAX_EMPLOYEES){            //jeżeli numer pracownika < max pracowników
         employees[employeesNumber] = person;       // dodaj do tablicy employees pracownika o numerze employeesNumber
         employeesNumber++;
     }
     else {
         System.out.println("Nie można dodać większej liczby pracowników");
     }
     }

     String printInfo() {
     String result = "";
         for (int i=0; i<employeesNumber; i++){
             result += employees[i].printInfo()+"\n";
                      }
            return result;
 }

}

