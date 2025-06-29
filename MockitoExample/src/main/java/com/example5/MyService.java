package com.example5;

public class MyService {
	private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String getCombinedStatus() {
        // Calls the same method twice
        return api.getStatus() + " & " + api.getStatus();
    }
}
