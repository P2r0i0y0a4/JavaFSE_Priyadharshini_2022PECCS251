package com.example2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MyServiceTest {

	@Test
    public void testVerifyInteraction() {
        // 1. Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Inject mock into service
        MyService service = new MyService(mockApi);

        // 3. Call method that should trigger interaction
        service.fetchData();

        // 4. Verify the interaction
        verify(mockApi).getData();  // ✅ This checks if getData() was called
        
    }

}
