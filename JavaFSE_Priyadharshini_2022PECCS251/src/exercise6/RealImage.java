package exercise6;


//Real Subject: The actual object that performs the heavy operation (loading an image).
public class RealImage implements Image {
 private String filename;

 public RealImage(String filename) {
     this.filename = filename;
     loadImageFromServer(); // Simulate heavy loading operation
 }

 private void loadImageFromServer() {
     System.out.println("Loading image: " + filename + " from remote server...");
     try {
         // Simulate network delay or heavy processing
         Thread.sleep(2000); // 2 seconds delay
     } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
         System.err.println("Image loading interrupted: " + e.getMessage());
     }
     System.out.println("Image " + filename + " loaded successfully.");
 }

 @Override
 public void display() {
     System.out.println("Displaying image: " + filename);
 }
}