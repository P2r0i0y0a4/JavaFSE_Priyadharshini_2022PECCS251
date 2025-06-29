package com.example.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ServiceTest {

	@Test
    public void testServiceWithMockRepository() {
        // 1. Create a mock repository using Mockito
        Repository mockRepository = mock(Repository.class);

        // 2. Stub the repository methods to return predefined data
        when(mockRepository.getData()).thenReturn("Mock Data");

        // 3. Create the Service under test, injecting the mock repository
        Service service = new Service(mockRepository);

        // 4. Call the method on the service that uses the repository
        String result = service.processData();

        // 5. Verify the service logic using the mocked repository's output
        assertEquals("Processed Mock Data", result);

        // Optional: Verify that the mock method was called
        verify(mockRepository).getData();
    }
}
