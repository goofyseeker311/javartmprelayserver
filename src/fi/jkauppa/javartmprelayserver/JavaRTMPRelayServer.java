package fi.jkauppa.javartmprelayserver;

import java.io.IOException;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;

public class JavaRTMPRelayServer {
	private ServerSocketFactory socketfactory = SSLServerSocketFactory.getDefault();
	private ServerSocket sslserversocket = null;
	private String upstreamserver = null;
	private int upstreamport = -1;
	private String uptreamkey = null;
	private int port = -1;
	private String relayuploadkey = null;
	private String relayclientkey = null;
	
	public JavaRTMPRelayServer(int vport) {
		try {
			sslserversocket = socketfactory.createServerSocket(port);
			
		} catch (IOException e) {e.printStackTrace();}
	}
	
	public static void main(String[] args) {
		int argport = 1935;
		try {argport = Integer.parseInt(args[0]);} catch(Exception ex) {}
		JavaRTMPRelayServer app = new JavaRTMPRelayServer(argport);
		System.out.println("exit.");
		System.exit(0);
	}

}
