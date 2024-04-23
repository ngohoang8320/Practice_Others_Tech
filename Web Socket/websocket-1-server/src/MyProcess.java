import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyProcess extends Thread {
    private Socket socket;

    public MyProcess(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter write = new PrintWriter(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);

            while (true) {
                //Receive
                String message;
                message = read.readLine();
                System.out.println("Client: " + message);

                //Sent
                System.out.print("Server: ");
                message = sc.nextLine();
                write.println(message);
                write.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}