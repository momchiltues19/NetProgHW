package org.elsys.netprog.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		ServerSocket serverSocket2 = null;
		try
		{
			serverSocket = new ServerSocket(10001);
			serverSocket2 = new ServerSocket(10002);
		    Socket clientSocket = serverSocket.accept();
		    Socket clientSocket2 = serverSocket2.accept();
		    System.out.println("client connected from " + clientSocket.getInetAddress());
		    System.out.println("client connected from " + clientSocket2.getInetAddress());
		    PrintWriter out =
		        new PrintWriter(clientSocket.getOutputStream(), true);
		    BufferedReader in = new BufferedReader(
		        new InputStreamReader(clientSocket.getInputStream()));
		    PrintWriter out2 =
			    new PrintWriter(clientSocket2.getOutputStream(), true);
			BufferedReader in2 = new BufferedReader(
			    new InputStreamReader(clientSocket2.getInputStream()));
		    
		    String inputLine;

		    while ((inputLine = in.readLine()) != null || (inputLine = in2.readLine()) != null)
		    {
		    	out.println(inputLine);
		    	out2.println(inputLine);
		        System.out.println(inputLine);
		        if (inputLine.equals("exit"))
		            break;
		    }
		} catch (Throwable t) {
			System.out.println(t.getMessage());
		} finally {
			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if (serverSocket2 != null && !serverSocket2.isClosed()) {
				serverSocket2.close();
			}
			
			System.out.println("Server closed");
		}
	}

}
