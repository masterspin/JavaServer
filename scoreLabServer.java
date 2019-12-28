//ritz363

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class scoreLabServer {

    public static void main(String args[]) throws IOException {

        ServerSocket server = new ServerSocket(8080);
        System.out.println("Connecting to port 8080");
        while (true) {
            try (Socket socket = server.accept()) {
                String text = "ritz363 loves contributing to ScoreLab";
                socket.getOutputStream().write(text.getBytes("UTF-8"));                
            }
        }
    }

}
