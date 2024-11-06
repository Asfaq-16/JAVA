package university.department;

public class MechanicalDepartment extends Department {
    private final int fee = 70000;

    @Override
    public void printBill() {
        super.printBill();
        System.out.println("Department: Mechanical");
        System.out.println("Fee: " + fee);
    }
}
