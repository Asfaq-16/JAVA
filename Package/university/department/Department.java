package university.department;

import java.util.Scanner;

public abstract class Department implements DepartmentInterface {
    protected String studentName;
    protected int year;

    @Override
    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        studentName = sc.nextLine();
        System.out.print("Enter year of study: ");
        year = sc.nextInt();
    }

    @Override
    public void printBill() {
        System.out.println("Student: " + studentName);
        System.out.println("Year: " + year);
    }
}
