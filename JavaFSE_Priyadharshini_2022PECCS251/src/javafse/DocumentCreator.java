package javafse;
public class DocumentCreator {
    public static void main(String[] args) {
        System.out.println("Demonstrating Factory Method Pattern:\n");
        // Create a Word Document
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.processDocument(); // Uses the factory method to create and process a WordDocument
        // Create a PDF Document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.processDocument(); // Uses the factory method to create and process a PdfDocument
        // Create an Excel Document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.processDocument(); // Uses the factory method to create and process an ExcelDocument
    }
}