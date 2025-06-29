package com.example4;

public class MyService {
	private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void process() {
        // some logic
        api.log("Processing complete");
    }
}
