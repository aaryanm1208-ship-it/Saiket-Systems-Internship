import java.util.ArrayList;
import java.util.Scanner;

// Task class representing a single task
class Task {
    String title;
    boolean isCompleted;

    Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[✔] " : "[ ] ") + title;
    }
}

public class ToDoListApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> taskList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    taskList.add(new Task(title));
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    if (taskList.isEmpty()) {
                        System.out.println("No tasks available.");
                        break;
                    }

                    System.out.println("Select task number to mark completed:");
                    for (int i = 0; i < taskList.size(); i++) {
                        System.out.println((i + 1) + ". " + taskList.get(i));
                    }

                    int taskNum = sc.nextInt();
                    if (taskNum >= 1 && taskNum <= taskList.size()) {
                        taskList.get(taskNum - 1).markCompleted();
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 3:
                    if (taskList.isEmpty()) {
                        System.out.println("No tasks to display.");
                    } else {
                        System.out.println("\n--- Your Tasks ---");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + ". " + taskList.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting To-Do List. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
