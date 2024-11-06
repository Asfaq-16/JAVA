import academic.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_STUDENTS = 10;
        Student[] students = new Student[MAX_STUDENTS];
        int studentCount = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add a New Student");
            System.out.println("2. Access an Existing Student");
            System.out.println("3. Exit the Program");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (studentCount < MAX_STUDENTS) {
                        System.out.println("Select the Type of Student:");
                        System.out.println("1. Undergraduate");
                        System.out.println("2. Graduate");
                        System.out.println("3. PhD");
                        System.out.print("Enter your choice: ");
                        int typeChoice = scanner.nextInt();
                        scanner.nextLine();
                        Student newStudent = null;

                        switch (typeChoice) {
                            case 1:
                                newStudent = new Undergraduate();
                                break;
                            case 2:
                                newStudent = new Graduate();
                                break;
                            case 3:
                                newStudent = new PhDStudent();
                                break;
                            default:
                                System.out.println("Invalid selection. Returning to the main menu.");
                                continue;
                        }

                        students[studentCount] = newStudent;
                        studentCount++;
                        System.out.println("Student has been created and added to the list.");
                    } else {
                        System.out.println("Student capacity reached. Unable to add more students.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the index of the student you want to access (0 to " + (studentCount - 1) + "): ");
                    int studentIndex = scanner.nextInt();
                    scanner.nextLine();

                    if (studentIndex >= 0 && studentIndex < studentCount) {
                        Student currentStudent = students[studentIndex];
                        boolean innerExit = false;
                        while (!innerExit) {
                            System.out.println("\n--- Operations for " + currentStudent.getName() + " ---");
                            System.out.println("1. Join a Workshop");
                            System.out.println("2. Enter a Contest");
                            System.out.println("3. Update Workshop Information");
                            System.out.println("4. Update Contest Information");
                            System.out.println("5. Show Student Details");
                            System.out.println("6. Return to Main Menu");
                            System.out.print("Please choose an operation: ");
                            int operationChoice = scanner.nextInt();

                            switch (operationChoice) {
                                case 1:
                                    currentStudent.participateInWorkshop();
                                    break;
                                case 2:
                                    currentStudent.participateInContest();
                                    break;
                                case 3:
                                    System.out.print("Enter the workshop number you wish to update: ");
                                    int workshopIndex = scanner.nextInt();
                                    currentStudent.updateWorkshopDetails(workshopIndex - 1);
                                    break;
                                case 4:
                                    System.out.print("Enter the contest number you wish to update: ");
                                    int contestIndex = scanner.nextInt();
                                    currentStudent.updateContestDetails(contestIndex - 1);
                                    break;
                                case 5:
                                    System.out.println("\n--- Student Information ---");
                                    currentStudent.displayStudentInfo();
                                    System.out.println("\n--- Workshop Details ---");
                                    currentStudent.printWorkshopDetails();
                                    System.out.println("\n--- Contest Details ---");
                                    currentStudent.printContestDetails();
                                    break;
                                case 6:
                                    innerExit = true;
                                    break;
                                default:
                                    System.out.println("Invalid option, please try again.");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Invalid index. No student found at that index.");
                    }
                    break;

                case 3:
                    exit = true;
                    System.out.println("Program is now closing.");
                    break;

                default:
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
}

