package EchoServerFTP;

import java.net.*;
import java.io.*;

public class ConcurrentEchoServer {
    public static void main(String[] args) {
        try {
            int SERVER_PORT = 7000;
            EchoServiceThread serviceThread;
            ServerSocket echoServer = new ServerSocket(SERVER_PORT);
            System.out.println("Accepting connections on port " + SERVER_PORT);
            while(true){
                Socket socket = echoServer.accept();
                serviceThread=new EchoServiceThread(socket);
                serviceThread.start();
            }
        } catch (IOException ex) {
            System.err.println("Socket error: "+ex);
        }
    }
}