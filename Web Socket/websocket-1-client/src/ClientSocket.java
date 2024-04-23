import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) {
        try {
            int port = 99;
            Socket socket = new Socket("localhost",
                    port);

            try {
                BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                PrintWriter write = new PrintWriter(socket.getOutputStream());

                Scanner sc = new Scanner(System.in);
                String message;

                while (true) {
                    //Sent
                    System.out.print("Client: ");
                    message = sc.nextLine();
                    write.println(message);
                    write.flush();

                    //Receive
                    message = read.readLine();
                    System.out.println("Server: " + message);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}