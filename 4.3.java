class Apple {
    public void show() {
        System.out.println("This is Apple's show() method.");
    }
}
class Banana extends Apple {
    public void show() {
        System.out.println("This is Banana's show() method.");
    }
}
class Cherry extends Apple {
    public void show() {
        System.out.println("This is Cherry's show() method.");
    }
}
class app {
    public static void main(String[] args) {
        Apple[] fruits = new Apple[3];
        fruits[0] = new Apple();
        fruits[1] = new Banana();
        fruits[2] = new Cherry();

        for (Apple fruit : fruits) {
            fruit.show();
        }
    }
}