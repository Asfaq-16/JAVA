import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Class to store department fee details
class Department {
    private String name;
    private int fee;

    public Department(String name, int fee) {
        this.name = name;
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return name + ", Fee: " + fee;
    }
}

// Class to store student details
class Student {
    private String name;
    private String year;
    private String phoneNumber;
    private String department;

    public Student(String name, String year, String phoneNumber, String department) {
        this.name = name;
        this.year = year;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nYear: " + year + "\nPhone Number: " + phoneNumber + "\nDepartment: " + department;
    }
}

public class FeeReceiptGenerator {

    public static void main(String[] args) {
        Map<String, Department> departmentMap = new HashMap<>();

        // Load department fees from file
        try (BufferedReader br = new BufferedReader(new FileReader("departments.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ", 3); // Split into serial number, department name, and fee
                String departmentName = parts[1];
                int fee = Integer.parseInt(parts[2]);
                departmentMap.put(departmentName, new Department(departmentName, fee));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Get student details
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter year: ");
        String year = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter department name from the below departments: ");
	System.out.println("ComputerEngineering\nMechanicalEngineering\nCivilEngineering\nElectricalEngineering\nElectronicsEngineering");
        String department = scanner.nextLine();

        // Create Student object
        Student student = new Student(name, year, phoneNumber, department);

        // Generate fee receipt
        Department deptDetails = departmentMap.get(student.getDepartment());
        if (deptDetails != null) {
            System.out.println("\n--- Fee Receipt ---");
            System.out.println(student); // Print student details
            System.out.println("Department Fee: " + deptDetails.getFee());
            System.out.println("-------------------");
        } else {
            System.out.println("No department found with the name " + student.getDepartment());
        }

        scanner.close();
    }
}
