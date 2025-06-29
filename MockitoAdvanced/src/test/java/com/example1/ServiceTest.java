package com.example1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class ServiceTest {

	@Test
    public void testServiceWithMockRepository() {
        // Step 1: Create mock repository
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub method
        when(mockRepository.getData()).thenReturn("Mock Data");

        // Step 3: Inject into service
        Service service = new Service(mockRepository);
        String result = service.processData();

        // Step 4: Verify result
        assertEquals("Processed Mock Data", result);

        // Step 5 (Optional): Verify repository interaction
        verify(mockRepository).getData();
    }
}
