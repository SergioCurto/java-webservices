package scurto.webservices.example;


import java.io.IOException;

import scurto.webservices.WebserviceGenericServer;

public class HelloWorldWebserviceServer extends WebserviceGenericServer<HelloWorldWebservice>{

	public HelloWorldWebserviceServer(String host, int port) {
		super(host,port,HelloWorldWebservice.class, new HelloWorldWebserviceImpl());
	}
	
	/**
	 * @param args [bindAddr, bindPort]
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String host = "";
		int port = 0;
		
		if(args.length != 2 ) {
			System.err.println("usage: <hostname/ip> <port>");
			System.err.println("\twhere: <port> = number from 1-65535");
			System.exit(-1);
		} else {
			host = args[0];
			String portStr = args[1];
			
			try {
				port = Integer.valueOf(portStr);
				
				if(port > 65535 || port < 1) {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException nfe) {
				System.err.println("usage: <hostname/ip> <port>");
				System.err.println("\twhere: <port> = number from 1-65535");
				System.err.println();
				System.err.println("<port> value invalid, got: "+portStr);
				System.exit(-1);
			}
		}
		
		System.out.println("Launching webservice on "+host+":"+port);
		
		HelloWorldWebserviceServer ws = new HelloWorldWebserviceServer(host, port);
		
		ws.run();
	}
}
