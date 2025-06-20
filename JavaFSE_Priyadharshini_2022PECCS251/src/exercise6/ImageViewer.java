package exercise6;


public class ImageViewer {
    public static void main(String[] args) {
        System.out.println("Demonstrating Proxy Pattern for Image Viewer:\n");

        // Create images using the Proxy
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.png");
        Image image3 = new ProxyImage("photo1.jpg"); // Same image as image1 to demonstrate caching

        System.out.println("--- First display of photo1.jpg ---");
        // Image 1 will be loaded from the server the first time it's displayed
        image1.display();
        System.out.println("\n");

        System.out.println("--- First display of photo2.png ---");
        // Image 2 will be loaded from the server the first time it's displayed
        image2.display();
        System.out.println("\n");

        System.out.println("--- Second display of photo1.jpg ---");
        // Image 1 will NOT be loaded again, as it's cached by the proxy
        image1.display();
        System.out.println("\n");

        System.out.println("--- Displaying photo1.jpg again using a new Proxy instance ---");
        // Note: If you create a new ProxyImage for the same filename, it will load again
        // unless you implement a more sophisticated global cache in the proxy.
        // For this exercise, the caching is per ProxyImage instance.
        image3.display();
        System.out.println("\n");

        System.out.println("--- Final display of photo2.png ---");
        image2.display();
    }
}