package academic;
import java.util.Scanner;

public abstract class Student implements Participation {
    String name;
    String id;
    int age;
    String department;
    int workshopCount = 0;
    int contestCount = 0;
    String[] workshopDetails;
    String[] contestDetails;

    public Student() {
        getInput();
        initializeParticipationArrays();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the student's name: ");
        this.name = scanner.nextLine();
        System.out.print("Please enter the student ID: ");
        this.id = scanner.nextLine();
        System.out.print("Please enter the student's age: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the department: ");
        this.department = scanner.nextLine();
    }

    public void initializeParticipationArrays() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number of workshops the student can participate in: ");
        int workshopSize = scanner.nextInt();
        scanner.nextLine();
        workshopDetails = new String[workshopSize];
        System.out.print("Enter the maximum number of contests the student can participate in: ");
        int contestSize = scanner.nextInt();
        scanner.nextLine();
        contestDetails = new String[contestSize];
    }

    public void updateWorkshopDetails(int index) {
        if (index < workshopDetails.length && workshopDetails[index] != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter updated workshop name and date (format: name, date): ");
            String newDetail = scanner.nextLine();
            workshopDetails[index] = newDetail;
            System.out.println("Workshop information successfully updated.");
        } else {
            System.out.println("Error: Invalid index or no existing workshop at this index.");
        }
    }

    public void updateContestDetails(int index) {
        if (index < contestDetails.length && contestDetails[index] != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter updated contest name and date (format: name, date): ");
            String newDetail = scanner.nextLine();
            contestDetails[index] = newDetail;
            System.out.println("Contest information successfully updated.");
        } else {
            System.out.println("Error: Invalid index or no existing contest at this index.");
        }
    }

    public abstract void displayStudentInfo();
    public abstract void printWorkshopDetails();
    public abstract void printContestDetails();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

