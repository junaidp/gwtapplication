package com.helloworld.server;

import com.helloworld.client.HelloService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class HelloServiceImpl extends RemoteServiceServlet implements
		HelloService {

	public String greetServer(String input) throws IllegalArgumentException {
		return "";
	}
}
