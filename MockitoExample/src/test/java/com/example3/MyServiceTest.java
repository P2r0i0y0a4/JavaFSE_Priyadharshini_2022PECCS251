package com.example3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class MyServiceTest {

	@Test
    public void testArgumentMatching() {
        // 1. Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Use mock in service
        MyService service = new MyService(mockApi);
        service.notifyUser(42);

        // 3. Verify with argument matchers
        verify(mockApi).sendMessage(eq(42), eq("Welcome!"));  // exact match
        // Or use general matchers:
        // verify(mockApi).sendMessage(anyInt(), anyString());
    }

}
