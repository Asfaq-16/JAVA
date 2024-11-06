package university.department;

public class CSDepartment extends Department {
    private final int fee = 120000;

    @Override
    public void printBill() {
        super.printBill();
        System.out.println("Department: Computer Science");
        System.out.println("Fee: " + fee);
    }
}
