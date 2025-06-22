package exercise6;

public class Readme {

/*
 * Project Structure:

ProxyPatternExample
├── src
│   └── com
│       └── imageviewer
│           ├── Image.java
│           ├── RealImage.java
│           ├── ProxyImage.java
│           └── ImageViewer.java
Code Implementation:

1. Define Subject Interface:

src/com/imageviewer/Image.java

2. Implement Real Subject Class:

src/com/imageviewer/RealImage.java

3. Implement Proxy Class:

src/com/imageviewer/ProxyImage.java

4. Test the Proxy Implementation:

src/com/imageviewer/ImageViewer.java

Output:

(Note: There will be 2-second delays for each initial image loading)

Demonstrating Proxy Pattern for Image Viewer:

--- First display of photo1.jpg ---
Proxy: Real image not loaded yet. Loading now...
Loading image: photo1.jpg from remote server...
Image photo1.jpg loaded successfully.
Displaying image: photo1.jpg

--- First display of photo2.png ---
Proxy: Real image not loaded yet. Loading now...
Loading image: photo2.png from remote server...
Image photo2.png loaded successfully.
Displaying image: photo2.png

--- Second display of photo1.jpg ---
Proxy: Image photo1.jpg is already loaded (from cache).
Displaying image: photo1.jpg

--- Displaying photo1.jpg again using a new Proxy instance ---
Proxy: Real image not loaded yet. Loading now...
Loading image: photo1.jpg from remote server...
Image photo1.jpg loaded successfully.
Displaying image: photo1.jpg

--- Final display of photo2.png ---
Proxy: Image photo2.png is already loaded (from cache).
Displaying image: photo2.png
Explanation of the Proxy Pattern in this example:

Subject Interface (Image):

Defines the common interface that both the RealImage and ProxyImage must implement. This ensures that the client code (ImageViewer) can treat them interchangeably.
Real Subject (RealImage):

This is the actual object that performs the core, potentially heavy, operation (loading an image from a remote server). It includes a loadImageFromServer() method to simulate this delay.
Proxy (ProxyImage):

Implements the Image interface so it can be substituted for a RealImage.
Holds a reference to a RealImage object (realImage). This RealImage instance is created only when it's actually needed.
Lazy Initialization: When display() is called for the first time, the ProxyImage checks if realImage is null (or isLoaded is false). If it is, it creates an instance of RealImage and then calls its display() method. This defers the expensive image loading until the image is actually requested.
Caching: If display() is called subsequent times for the same ProxyImage instance, the RealImage is already present, and the ProxyImage simply delegates the call without re-loading the image. This demonstrates a simple form of caching.
Benefits of using the Proxy Pattern here:

Lazy Initialization (Virtual Proxy): Objects that are expensive to create (like downloading an image) are only created when they are actually needed, improving application startup time and resource usage.
Caching: The proxy can cache the result of the real subject's operation, preventing redundant expensive calls if the same operation is requested multiple times.
Controlled Access: The proxy acts as a gatekeeper, adding an extra layer of control before accessing the real object. This could be used for security, logging, or other access restrictions.
Separation of Concerns: The concerns of image loading/display (RealImage) are separated from the concerns of lazy loading and caching (ProxyImage).

 */
}
