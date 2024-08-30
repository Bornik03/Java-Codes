interface Motor {
    int capacity = 0;
    void run();
    void consume();
}
class WashingMachine implements Motor {
    int washingCapacity;
    WashingMachine(int washingCapacity) {
        this.washingCapacity = washingCapacity;
    }
    public void run() {
        System.out.println("Washing machine is running.");
    }
    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }
    public int getWashingCapacity() {
        return washingCapacity;
    }
}
class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(8);
        System.out.println("Motor Capacity: " + Motor.capacity);
        System.out.println("Washing Machine Capacity: " + washingMachine.getWashingCapacity());
        washingMachine.run();
        washingMachine.consume();
    }
}