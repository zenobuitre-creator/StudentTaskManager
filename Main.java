public class Main {
    public static void main(String[] args) {

        String[] tasks = {
            "Complete Java homework",
            "Study for database exam",
            "Submit project report"
        };

        System.out.println("=== Student Task Manager ===");
        System.out.println("My Academic Tasks:");

        for (int i = 0; i < tasks.length; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }
    }
}