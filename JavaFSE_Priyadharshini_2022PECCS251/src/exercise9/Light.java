package exercise9;

//Receiver: The object that knows how to perform the actual operations.
public class Light {
 private String location;

 public Light(String location) {
     this.location = location;
 }

 public void turnOn() {
     System.out.println(location + " Light is ON");
 }

 public void turnOff() {
     System.out.println(location + " Light is OFF");
 }
}