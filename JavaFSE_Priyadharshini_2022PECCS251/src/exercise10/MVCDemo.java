package exercise10;

public class MVCDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating MVC Pattern for Student Records:\n");

        // 1. Retrieve Student data from "database" (simulated)
        Student model = retrieveStudentFromDatabase();

        // 2. Create a View
        StudentView view = new StudentView();

        // 3. Create a Controller, linking Model and View
        StudentController controller = new StudentController(model, view);

        // Initial display of student details
        System.out.println("--- Initial Student Details ---");
        controller.updateView();
        System.out.println("\n");

        // Update student details via the Controller
        System.out.println("--- Updating Student's Name and Grade ---");
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("A+");

        // Display updated student details
        controller.updateView();
        System.out.println("\n");

        System.out.println("--- Updating Student's ID ---");
        controller.setStudentId("S1002");
        controller.updateView();
    }

    // Simulate retrieving student data from a database
    private static Student retrieveStudentFromDatabase() {
        // In a real application, this would fetch data from a database, file, etc.
        Student student = new Student("John Smith", "S1001", "B");
        return student;
    }
}