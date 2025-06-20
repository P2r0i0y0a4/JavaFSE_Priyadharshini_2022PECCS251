package javafse;

// Abstract Creator class
public abstract class DocumentFactory {
    // The factory method
    public abstract Document createDocument();

    // Other common operations can be defined here
    public void processDocument() {
        Document document = createDocument(); // Call the factory method
        document.open();
        document.save();
        document.close();
        System.out.println("Document processed successfully.\n");
    }
}