package com.example3;

public class MyService {
	private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void notifyUser(int userId) {
        api.sendMessage(userId, "Welcome!");
    }
}
