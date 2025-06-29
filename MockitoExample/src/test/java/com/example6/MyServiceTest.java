package com.example6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

class MyServiceTest {

	 @Test
	    public void testMethodCallOrder() {
	        // 1. Create mock
	        ExternalApi mockApi = mock(ExternalApi.class);

	        // 2. Use mock in service
	        MyService service = new MyService(mockApi);
	        service.process();

	        // 3. Verify interaction order
	        InOrder inOrder = Mockito.inOrder(mockApi);

	        inOrder.verify(mockApi).connect();
	        inOrder.verify(mockApi).fetchData();
	    }
}
