package com.example4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class NetworkServiceTest {

	@Test
    public void testServiceWithMockNetworkClient() {
        // Step 1: Create a mock of NetworkClient
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        // Step 2: Stub connect() to simulate a connection
        when(mockNetworkClient.connect()).thenReturn("Mock Connection");

        // Step 3: Inject mock into service and call method
        NetworkService networkService = new NetworkService(mockNetworkClient);
        String result = networkService.connectToServer();

        // Step 4: Assert the expected result
        assertEquals("Connected to Mock Connection", result);

        // Step 5: Verify that connect() was called
        verify(mockNetworkClient).connect();
    }

}
