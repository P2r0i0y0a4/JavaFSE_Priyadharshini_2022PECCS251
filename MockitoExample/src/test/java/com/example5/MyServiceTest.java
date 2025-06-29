package com.example5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class MyServiceTest {

	@Test
    public void testMultipleReturns() {
        // 1. Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Stub with multiple return values
        when(mockApi.getStatus())
            .thenReturn("Online")
            .thenReturn("Offline");

        // 3. Use the mock
        MyService service = new MyService(mockApi);
        String result = service.getCombinedStatus();

        // 4. Assert result
        assertEquals("Online & Offline", result);
    }
}
