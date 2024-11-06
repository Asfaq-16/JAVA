package academic;

import java.util.Scanner;

public class Graduate extends Student {
    private String thesisTitle;

    public Graduate() {
        super();
        getGraduateInput();
    }

    public void getGraduateInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter thesis title: ");
        this.thesisTitle = scanner.nextLine();
    }

 
    public void displayStudentInfo() {
        System.out.println("Graduate Student: " + name + ", Thesis Title: " + thesisTitle);
    }

   
    public void participateInWorkshop() {
        if (workshopCount < workshopDetails.length) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter workshop name and date (format: name, date): ");
            String detail = scanner.nextLine();
            workshopDetails[workshopCount] = detail;
            workshopCount++;
            System.out.println(name + " has participated in " + workshopCount + " workshops.");
            printWorkshopDetails();
        } else {
            System.out.println("No more workshops can be added.");
        }
    }

    
    public void participateInContest() {
        if (contestCount < contestDetails.length) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter contest name and date (format: name, date): ");
            String detail = scanner.nextLine();
            contestDetails[contestCount] = detail;
            contestCount++;
            System.out.println(name + " has participated in " + contestCount + " contests.");
            printContestDetails();
        } else {
            System.out.println("No more contests can be added.");
        }
    }

    public void printWorkshopDetails() {
        System.out.println("Workshop details:");
        for (int i = 0; i < workshopCount; i++) {
            System.out.println((i + 1) + ". " + workshopDetails[i]);
        }
    }

    public void printContestDetails() {
        System.out.println("Contest details:");
        for (int i = 0; i < contestCount; i++) {
            System.out.println((i + 1) + ". " + contestDetails[i]);
        }
    }
}
