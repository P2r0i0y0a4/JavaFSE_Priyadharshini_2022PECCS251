package com.example3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class FileServiceTest {

	@Test
    public void testServiceWithMockFileIO() {
        // Step 1: Create mock FileReader and FileWriter
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        // Step 2: Stub the read method
        when(mockFileReader.read()).thenReturn("Mock File Content");

        // Step 3: Inject mocks into FileService
        FileService fileService = new FileService(mockFileReader, mockFileWriter);

        // Step 4: Call processFile and assert result
        String result = fileService.processFile();
        assertEquals("Processed Mock File Content", result);

        // Step 5: Verify interaction with FileWriter
        verify(mockFileWriter).write("Processed Mock File Content");
    }

}
