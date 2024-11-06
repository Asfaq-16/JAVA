package university.department;

public class CivilDepartment extends Department {
    private final int fee = 50000;

    @Override
    public void printBill() {
        super.printBill();
        System.out.println("Department: Civil");
        System.out.println("Fee: " + fee);
    }
}
