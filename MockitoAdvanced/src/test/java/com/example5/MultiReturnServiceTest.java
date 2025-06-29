package com.example5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class MultiReturnServiceTest {

	@Test
    public void testServiceWithMultipleReturnValues() {
        // Step 1: Create mock
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub method with multiple returns
        when(mockRepository.getData())
            .thenReturn("First Mock Data")
            .thenReturn("Second Mock Data");

        // Step 3: Inject into service
        Service service = new Service(mockRepository);

        // Step 4: Call method multiple times
        String firstResult = service.processData();
        String secondResult = service.processData();

        // Step 5: Assert results
        assertEquals("Processed First Mock Data", firstResult);
        assertEquals("Processed Second Mock Data", secondResult);

        // Optional: Verify method was called twice
        verify(mockRepository, times(2)).getData();
    }

}
