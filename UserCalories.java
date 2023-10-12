import java.util.Scanner;

public class LabProgram {

    private static double activityCalories(String userActivity, int userMinutes) {
        double userCalories = 0;

        if (userActivity.equals("sit")) {
            userCalories = 1.4 * userMinutes;
        } else if (userActivity.equals("walk")) {
            userCalories = 5.4 * userMinutes;
        } else if (userActivity.equals("run")) {
            userCalories = 13.0 * userMinutes;
        } else if (userActivity.equals("bike")) {
            userCalories = 6.8 * userMinutes;
        } else if (userActivity.equals("swim")) {
            userCalories = 8.7 * userMinutes;
        }
        return userCalories;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userMinutes;
        String userActivity;

        userActivity = scnr.next();
        userMinutes = scnr.nextInt();

        System.out.println(activityCalories(userActivity, userMinutes));
    }
}
