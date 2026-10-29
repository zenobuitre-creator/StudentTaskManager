
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Complete Java homework");
        tasks.add("Study for database exam");
        tasks.add("Submit project report");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome, " + name + "!");

        System.out.print("How many new tasks do you want to add? ");
        int numberOfTasks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfTasks; i++) {
            System.out.print("Enter task " + i + ": ");
            String newTask = scanner.nextLine();
            tasks.add(newTask);
        }

        int choice = 0;

        while (choice != 5) {
            System.out.println("=== Student Task Manager ===");
            System.out.println("1. View all tasks");
            System.out.println("2. Add new tasks");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("=== My Academic Tasks ===");

                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }

            } else if (choice == 2) {
                System.out.print("How many tasks do you want to add? ");
                int number = scanner.nextInt();
                scanner.nextLine();

                for (int i = 1; i <= number; i++) {
                    System.out.print("Enter task " + i + ": ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                }

                System.out.println("Tasks added successfully!");

            } else if (choice == 3) {
                System.out.println("=== My Academic Tasks ===");

                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }

                System.out.print("Enter the task number to mark as completed: ");
                int taskNumber = scanner.nextInt();
                scanner.nextLine();

                if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                    String task = tasks.get(taskNumber - 1);

                    if (!task.startsWith("[Completed] ")) {
                        tasks.set(taskNumber - 1, "[Completed] " + task);
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("This task is already completed.");
                    }
                } else {
                    System.out.println("Invalid task number.");
                }

            } else if (choice == 4) {
                System.out.println("=== My Academic Tasks ===");

                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }

                if (tasks.isEmpty()) {
                    System.out.println("There are no tasks to delete.");
                } else {
                    System.out.print("Enter the task number to delete: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Task deleted successfully!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }

            } else if (choice == 5) {
                System.out.println("Exiting Student Task Manager. Goodbye!");

            } else {
                System.out.println("Invalid option. Please choose 1 to 5.");
            }
        }

        scanner.close();
    }
}
