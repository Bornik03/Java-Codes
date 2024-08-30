import java.util.*;
interface Employee {
    int earnings(int basic);
    int deductions(int basic);
    int bonus(int basic);
}
abstract class Manager implements Employee {
    public int earnings(int basic) {
        return (basic + ((basic * 80) / 100) + ((basic * 15) / 100));
    }
    public int deductions(int basic) {
        return ((basic * 12) / 100);
    }
}
class Substaff extends Manager {
    public int bonus(int basic) {
        return ((basic * 50) / 100);
    }
}
class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basic salary - ");
        int basic = sc.nextInt();
        Substaff substaff = new Substaff();
        int earnings = substaff.earnings(basic);
        int deductions = substaff.deductions(basic);
        int bonus = substaff.bonus(basic);
        System.out.println("Earnings - " + earnings);
        System.out.println("Deductions - " + deductions);
        System.out.println("Bonus - " + bonus);
    }
}