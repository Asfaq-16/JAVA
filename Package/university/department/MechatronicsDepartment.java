package university.department;

public class MechatronicsDepartment extends Department {
    private final int fee = 80000;

    @Override
    public void printBill() {
        super.printBill();
        System.out.println("Department: Mechatronics");
        System.out.println("Fee: " + fee);
    }
}
