import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    ChatServer chatServer;
    private Socket mySocket;
    private String id;
    private InputStream input;
    private OutputStream output;

    public ClientHandler(Socket mySocket,
                         String id,
                         ChatServer chatServer) {
        this.mySocket = mySocket;
        this.id = id;
        this.chatServer = chatServer;
        try {
            this.input = mySocket.getInputStream();
            this.output = mySocket.getOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead = input.read(buffer)) != -1) {
                String message = new String(buffer,
                        0,
                        byteRead); //Get the String from a byte array
                chatServer.broadcastMessage(this.id,
                        message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        try {
            output.write(message.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getId() {
        return id;
    }
}
