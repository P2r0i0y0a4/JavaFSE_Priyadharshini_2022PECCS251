package com.example7;

public class MyService {
	private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void removeRecord(String id) {
        api.deleteRecord(id);
    }
}
