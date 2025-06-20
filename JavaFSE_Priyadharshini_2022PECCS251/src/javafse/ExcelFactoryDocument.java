package javafse;

// Concrete Creator for Excel documents
public class ExcelFactoryDocument extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}