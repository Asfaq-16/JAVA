package university.department;

public class ITDepartment extends Department {
    private final int fee = 100000;

    @Override
    public void printBill() {
        super.printBill();
        System.out.println("Department: Information Technology");
        System.out.println("Fee: " + fee);
    }
}
