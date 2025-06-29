package com.example4;

public class NetworkService {
	private NetworkClient client;

    public NetworkService(NetworkClient client) {
        this.client = client;
    }

    public String connectToServer() {
        String connection = client.connect();
        return "Connected to " + connection;
    }
}
