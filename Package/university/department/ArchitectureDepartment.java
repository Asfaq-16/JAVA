package university.department;

public class ArchitectureDepartment extends Department {
    private final int fee = 40000;

    @Override
    public void printBill() {
        super.printBill();
        System.out.println("Department: Architecture");
        System.out.println("Fee: " + fee);
    }
}
