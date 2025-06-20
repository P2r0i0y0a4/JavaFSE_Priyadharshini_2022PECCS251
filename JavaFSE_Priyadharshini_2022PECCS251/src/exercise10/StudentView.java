package exercise10;

//View: Responsible for displaying the data from the Model.
//It does not contain any business logic.
public class StudentView {

 public void displayStudentDetails(String studentName, String studentId, String studentGrade) {
     System.out.println("--- Student Details ---");
     System.out.println("Name: " + studentName);
     System.out.println("ID: " + studentId);
     System.out.println("Grade: " + studentGrade);
     System.out.println("-----------------------");
 }
}