package com.example7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class MyServiceTest {

	 @Test
	    public void testVoidMethodThrowsException() {
	        // 1. Create mock
	        ExternalApi mockApi = mock(ExternalApi.class);

	        // 2. Stub the void method to throw exception when called
	        doThrow(new RuntimeException("Delete failed")).when(mockApi).deleteRecord("123");

	        // 3. Use mock in service
	        MyService service = new MyService(mockApi);

	        // 4. Test exception is thrown
	        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
	            service.removeRecord("123");
	        });

	        assertEquals("Delete failed", thrown.getMessage());

	        // 5. Verify method interaction
	        verify(mockApi).deleteRecord("123");
	    }
}
