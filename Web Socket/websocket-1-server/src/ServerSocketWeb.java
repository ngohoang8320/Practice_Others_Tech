import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketWeb {
    public static void main(String[] args) {
        try {
            int port = 99;
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                MyProcess mp = new MyProcess(clientSocket);
                mp.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
