import java.util.Random;

public class WorkingHours {
    public static void main(String[] args) {
        Random random = new Random();
        int secondsRemaining = random.nextInt(28801);

        System.out.println("Осталось секунд: " + secondsRemaining);
    }

    public static void printHoursRemaining(int seconds) {
        int hours = seconds / 3600;

        if (hours > 0){
            System.out.println("Осталось " + hours + " " + getHoursString(hours));
        }else {
            System.out.println("Осталось менее часа");
        }

    }

    public static String getHoursString(int hours){
        return hours == 1 ? "час" : (hours >= 2 && hours <= 4) ? "часа" : "часов";

    }
}
