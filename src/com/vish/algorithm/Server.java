package com.vish.algorithm;

public abstract class Server {

	private String serverName;
	
	public Server(){
		this.serverName = "Unix Server";
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	
}
