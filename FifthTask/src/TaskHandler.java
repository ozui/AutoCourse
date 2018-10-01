import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskHandler {
    public static Scanner in = new Scanner(System.in);
    public static ArrayList<Task> tasks = new ArrayList<>();
    public static final String mainMenu = "\n1. Enter new task\n" +
            "2. Calculate time for all tasks\n" +
            "3. List of tasks with defined priority\n" +
            "4. Which tasks can be done in N days\n" +
            "5. Print tasks\n" +
            "6. Exit\n";

    public static void main(String[] args) {
        int menuPoint = 0;
        while (menuPoint != 6) {
            System.out.println(mainMenu);
            menuPoint = in.nextInt();
            switch (menuPoint) {
                case 1:
                    enterTask();
                    break;
                case 2:
                    calculateTime();
                    break;
                case 3:
                    listTasksWithPriority();
                    break;
                case 4:
                    getTasksByPriority();
                    break;
                case 5:
                    printTasks();
                    break;
            }

        }

    }

    private static void enterTask() {
        System.out.println("Enter task name: ");
        String name = in.next();
        System.out.println("Enter task priority: \n1. HIGH\n2. MEDIUM\n3. LOW");
        Priority p = null;
        switch (in.next()) {
            case "1":
                p = Priority.HIGH;
                break;
            case "2":
                p = Priority.MEDIUM;
                break;
            case "3":
                p = Priority.LOW;
                break;
            default:
                p = Priority.LOW;
                break;

        }
        System.out.println("Enter task complexity number: \n1. HARD\n2. MEDIUM\n3. EASY");
        Complexity c = null;
        switch (in.next()) {
            case "1":
                c = Complexity.HARD;
                break;
            case "2":
                c = Complexity.MEDIUM;
                break;
            case "3":
                c = Complexity.EASY;
                break;
            default:
                c = Complexity.EASY;
                break;
        }

        tasks.add(new Task(name, p, c));
    }

    public static void calculateTime() {
        int h = 0;
        for (Task task : tasks) {
            h += task.getComplexity().getHours();
        }
        System.out.println("Time needed for all tasks: " + h);
    }

    public static void listTasksWithPriority() {
        System.out.println("Enter desired priority: \n1. HIGH\n2. MEDIUM\n3. LOW");
        Priority p = null;
        switch (in.next()) {
            case "1":
                p = Priority.HIGH;
                break;
            case "2":
                p = Priority.MEDIUM;
                break;
            case "3":
                p = Priority.LOW;
                break;
            default:
                p = Priority.LOW;
                break;

        }

        for (Task task : tasks) {
            if (task.getPriority() == p) {
                System.out.println(task.toString());
            }

        }
    }

    public static void getTasksByPriority() {
        // Supposed that day consists of 8 hours
        //TODO sort by priority first and then by hours
        System.out.println("Enter N days: ");
        int d = in.nextInt();
        int h = d * 8;
        Collections.sort(tasks);
        for (Task task : tasks) {
            if (task.getComplexity().getHours() <= h) {
                System.out.println(task.toString());
                h -= task.getComplexity().getHours();
            }
        }

    }

    public static void printTasks() {
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
    }
}
