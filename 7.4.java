import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String errorMessage) {
        super(errorMessage);
    }
}
class MinException extends Exception {
    public MinException(String errorMessage) {
        super(errorMessage);
    }
}
class SecException extends Exception {
    public SecException(String errorMessage) {
        super(errorMessage);
    }
}
class Time {
    int hours;
    int minutes;
    int seconds;
    public void setTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("InvalidHourException: hour is not greater than 24");
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException("InvalidMinuteException: minute is not greater than 60");
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException("InvalidSecondException: second is not greater than 60");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String toString() {
        return "Correct Time-> " + hours + ":" + minutes + ":" + seconds;
    }
    public static void main(String[] args) {
        Time time = new Time();
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter hr min sec");
            int hr=sc.nextInt();
            int mi=sc.nextInt();
            int se=sc.nextInt();
            time.setTime(hr, mi, se);
            System.out.println(time);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
