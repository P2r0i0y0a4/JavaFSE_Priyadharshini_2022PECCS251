package exercise6;


//Proxy: Controls access to the RealSubject and adds lazy initialization and caching.
public class ProxyImage implements Image {
 private String filename;
 private RealImage realImage; // Reference to the RealImage
 private boolean isLoaded;    // For lazy initialization (optional, could just check realImage == null)

 public ProxyImage(String filename) {
     this.filename = filename;
     this.isLoaded = false; // Initially, the real image is not loaded
 }

 @Override
 public void display() {
     // Lazy Initialization: Load the image only when it's requested for display
     if (!isLoaded) { // Or if (realImage == null)
         System.out.println("Proxy: Real image not loaded yet. Loading now...");
         realImage = new RealImage(filename);
         isLoaded = true;
     } else {
         // Caching: If already loaded, no need to load again.
         System.out.println("Proxy: Image " + filename + " is already loaded (from cache).");
     }
     realImage.display();
 }
}