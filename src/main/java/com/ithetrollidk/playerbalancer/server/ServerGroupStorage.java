package com.ithetrollidk.playerbalancer.server;

import java.util.Map;

public class ServerGroupStorage {

    private final String name;

    private final Map<String, BungeeServer> servers;

    public ServerGroupStorage(String name, Map<String, BungeeServer> servers) {
        this.name = name;

        this.servers = servers;
    }

    public String getName() {
        return name;
    }

    public Boolean containsServer(String serverName) {
        return this.servers.containsKey(serverName);
    }

    public Map<String, BungeeServer> getServers() {
        return servers;
    }
}