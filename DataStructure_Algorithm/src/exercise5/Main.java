package exercise5;

class Task {
    private String taskId;
    private String taskName;
    private String status;

    public Task(String taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    // Getters
    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + ", Task Name: " + taskName + ", Status: " + status;
    }
}

class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

class TaskManagementSystem {
    private Node head;

    public TaskManagementSystem() {
        head = null;
    }

    // Add a task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by ID
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Traverse and display all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        // If the task to be deleted is the head
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId().equals(taskId)) {
                current.next = current.next.next; // Bypass the node to delete it
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }
}

public class Main {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        // Create tasks
        Task task1 = new Task("T001", "Design Database", "In Progress");
        Task task2 = new Task("T002", "Implement API", "Pending");
        Task task3 = new Task("T003", "Write Documentation", "Completed");

        // Add tasks
        tms.addTask(task1);
        tms.addTask(task2);
        tms.addTask(task3);

        // Display all tasks
        System.out.println("All Tasks:");
        tms.traverseTasks();

        // Search for a task
        System.out.println("\nSearching for task T002:");
        Task foundTask = tms.searchTask("T002");
        if (foundTask != null) {
            System.out.println("Found: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        System.out.println("\nDeleting task T002:");
        tms.deleteTask("T002");

        // Display all tasks after deletion
        System.out.println("All Tasks after deletion:");
        tms.traverseTasks();
    }
}
