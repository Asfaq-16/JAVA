package university.main;

import university.department.*;

import java.util.Scanner;

public class FeeBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Department: ");
        System.out.println("1. Information Technology");
        System.out.println("2. Computer Science");
        System.out.println("3. Mechanical");
        System.out.println("4. Mechatronics");
        System.out.println("5. Civil");
        System.out.println("6. Architecture");
        
        int choice = sc.nextInt();
        DepartmentInterface department = null;

        switch (choice) {
            case 1:
                department = new ITDepartment();
                break;
            case 2:
                department = new CSDepartment();
                break;
            case 3:
                department = new MechanicalDepartment();
                break;
            case 4:
                department = new MechatronicsDepartment();
                break;
            case 5:
                department = new CivilDepartment();
                break;
            case 6:
                department = new ArchitectureDepartment();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        department.getStudentDetails();
        department.printBill();
    }
}
