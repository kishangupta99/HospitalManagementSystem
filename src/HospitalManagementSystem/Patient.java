package HospitalManagementSystem;

import java.sql.Connection;
import java.util.Scanner;

public class Patient {
    private Connection connection;
    private Scanner scanner;

    private Patient(Connection connection, Scanner scanner){
        this.connection =connection;
        this .scanner = scanner;
    }
    public void addPatient(){
        System.out.print("Enter Patient Name: ");
        String name =scanner.next();
        System.out.print("Enter Patient Age: ");
        int age =scanner.nextInt();
        System.out.print("Enter Patient Gender: ");
        String gender =scanner.next();

    }
}
