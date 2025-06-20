package exercise10;

//Controller: Handles user input, interacts with the Model, and updates the View.
//It acts as an intermediary between Model and View.
public class StudentController {
 private Student model; // Reference to the Model
 private StudentView view;   // Reference to the View

 public StudentController(Student model, StudentView view) {
     this.model = model;
     this.view = view;
 }

 // Methods to interact with the Model (set data)
 public void setStudentName(String name) {
     model.setName(name);
 }

 public void setStudentId(String id) {
     model.setId(id);
 }

 public void setStudentGrade(String grade) {
     model.setGrade(grade);
 }

 // Methods to interact with the View (get data from Model and display)
 public String getStudentName() {
     return model.getName();
 }

 public String getStudentId() {
     return model.getId();
 }

 public String getStudentGrade() {
     return model.getGrade();
 }

 // Method to update the view
 public void updateView() {
     view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
 }
}