package com.example2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class ApiServiceTest {
	@Test
    public void testServiceWithMockRestClient() {
        // 1. Create mock REST client
        RestClient mockRestClient = mock(RestClient.class);

        // 2. Stub the getResponse() method
        when(mockRestClient.getResponse()).thenReturn("Mock Response");

        // 3. Inject into ApiService
        ApiService apiService = new ApiService(mockRestClient);

        // 4. Call the method and verify result
        String result = apiService.fetchData();
        assertEquals("Fetched Mock Response", result);

        // 5. Optional: Verify that getResponse() was called
        verify(mockRestClient).getResponse();
    }

}
