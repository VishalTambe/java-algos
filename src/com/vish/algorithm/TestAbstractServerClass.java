package com.vish.algorithm;

public class TestAbstractServerClass {

	public static void main(String[] args) {
		Server server = new ServerImpl();
		System.out.println(server.getServerName());
	}
}
