package EchoServerFTP;

import java.net.*;
import java.io.*;
import java.nio.file.Path;
import java.util.Date;

public class EchoServiceThread extends Thread {
    Socket sock;

    public EchoServiceThread(Socket sock) {
        this.sock = sock;
    }

    @Override
    public void run() {
        try {
            System.out.println("Got connected");
            InputStream sockIn = sock.getInputStream();
            OutputStream sockOut = sock.getOutputStream();
            String path = "C:\\Users\\kuhnr\\Desktop\\EI_projects\\Erweiterte Informatik\\Socket_Output_Files\\";
            Date timestamp =

            int c;

            while ((c = sockIn.read()) != -1) {
                sockOut.write((char) c);
                System.out.print((char) c);
            }
            System.out.println("Closing connection");
            sockIn.close();sockOut.close();sock.close();
        } catch (IOException ex) {
            System.err.println("Socket error: " + ex);
        }
    }
}