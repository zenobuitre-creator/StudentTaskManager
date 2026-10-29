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

        System.out.println("=== Student Task Manager ===");
        System.out.println("My Academic Tasks:");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        scanner.close();
    }
}
