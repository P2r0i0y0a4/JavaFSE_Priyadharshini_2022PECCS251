package com.example4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class MyServiceTest {

	@Test
    public void testVoidMethodInteraction() {
        // 1. Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Stub the void method (optional if it does nothing)
        doNothing().when(mockApi).log(anyString());

        // 3. Use mock in service
        MyService service = new MyService(mockApi);
        service.process();

        // 4. Verify the void method was called with expected argument
        verify(mockApi).log(eq("Processing complete"));
    }

}
