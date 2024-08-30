class Bank {
    public double getInterest() {
        return 0.0;
    }
    public double getInterest(int term) {
        return 0.0;
    }
    public double getInterest(String type) {
        return 0.0;
    }
}
class SBI extends Bank {
    public double getInterest() {
        return 7.0;
    }
}
class ICICI extends Bank {
    public double getInterest() {
        return 8.0;
    }
    public double getInterest(int term) {
        return 8.0;
    }
}
class Axis extends Bank {
    public double getInterest() {
        return 9.0;
    }
    public double getInterest(String type) {
        return 9.0;
    }
}
class lab5 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        Axis axis = new Axis();
        System.out.println("Interest rate for SBI: " + sbi.getInterest() + "%");
        System.out.println("Interest rate for ICICI: " + icici.getInterest() + "%");
        System.out.println("Interest rate for Axis: " + axis.getInterest() + "%");
    }
}